package ru.geekbrains.skryabinegor.lesson4;

import java.util.Random;
import java.util.Scanner;

public class GameXO
{
    static char[][] field;
    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static void craftField(){
        field = new char[SIZE][SIZE];

        for (int i = 0;i < field.length; i ++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                field[i][j] = DOT_EMPTY;

            }
        }


    }
    static  void printField()
     {
         for(int i = 0; i <= SIZE; i++)
         {
             System.out.print(i + " ");
         }
         System.out.println();

         for (int i = 0; i < SIZE; i++){
             System.out.print((i+1) + " ");

             for (int j = 0; j < SIZE; j++){
                 System.out.print(field[i][j] + " ");
             }
             System.out.println();

         }

    }
    static void humanPlayer()
    {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Enter coordinates: X Y ");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;

        }while (!isCheckEnter(y,x));

        field[y][x] = DOT_X;
    }

    static void botPlayer() {
        Random rand = new Random();
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);

        } while (!isCheckEnter(y, x));
        System.out.println("Computer make move:" + y + " and " + x );
        field[y][x] = DOT_O;
    }
    static  boolean checkLine(char symb, int i, int j)
    {
        boolean vertical, horizontal;

        for (int vert = 0; vert < SIZE; vert++) {
            vertical = true;
            horizontal = true;
            for (int hori = 0; hori < SIZE; hori++)
            {
                vertical &= (field[vert][hori] == symb);
                horizontal &= (field[hori][vert] == symb);
            }
            if (vertical || horizontal) return true;

        }
        return false;
    }
    static boolean checkDiagonal(char symb, int i, int j)
    {
        boolean right, left;
        right = true;
        left = true;
        for (i = 0; i < SIZE; i++) {
            right &= (field[i][i] == symb);
            left &= (field[3-i-1][i] == symb);
        }
        if (right || left) return true;
        return false;
    }


     static boolean checkWinner (char symb )
    {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < 3; j++){
                if (checkDiagonal (symb, i, j) || checkLine (symb, i, j)) return true;
            }
        }
        return false;





        /*  if (field[0][0] == win && field[0][1] == win && field[0][2] == win)
        {
            return true;
        }
        if (field[1][0] == win && field[1][1] == win && field[1][2] == win )
        {
            return true;
        }
        if (field[2][0] == win && field[2][1] == win && field[2][2] == win)
        {
            return true;
        }
        if (field[0][0] == win && field[1][0] == win && field[2][0] == win)
        {
            return true;
        }
        if (field[0][1] == win && field[1][1] == win && field[2][1] == win)
        {
            return true;
        }
        if (field[0][2] == win && field[1][2] == win && field[2][2] == win)
        {
            return true;
        }
        if (field[0][0] == win && field[1][1] == win && field[2][2] == win)
        {
            return true;
        }
        if (field[0][2] == win && field[1][1] == win && field[2][0] == win)
        {
            return true;
        }
       return false;*/

    }
    static boolean isDrawGame()
    {
        for (int i = 0; i < field.length; i++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                if (field[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isCheckEnter(int y, int x)
    {
       if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
       {
           return false;

       }
       if (field[y][x] == DOT_EMPTY)
       {
           return true;
       }
       return false;
    }


    public static void main(String[] args){
        craftField();
        printField();

        while (true) {
             humanPlayer();
             printField();

             if (checkWinner(DOT_X))
             {
                 System.out.println("Human WIN!");
                 break;
             }
             if  (isDrawGame())
             {
                 System.out.println(" Draw ! ");
                 break;
             }
             botPlayer();
             printField();
             if (checkWinner(DOT_O))
             {
                 System.out.println(" ROBOT WIN ! ");
             }
             if (isDrawGame())
             {
                 System.out.println(" Draw ! ");
                 break;
             }

        }
        System.out.println(" GAME OVER ! ");

    }
}






















































