package ru.geekbrains.skryabin_egor.lesson3;


import java.util.Random;
import java.util.Scanner;

/*1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

public class Main {
    public static void main(String[] args) {
        System.out.println("    Guess The Number  :   ");

        randomNumber();
        bordenNumber();



    }

    static void randomNumber() {
        Random rnumb = new Random();
        do {

            int randNumber = rnumb.nextInt(10);
            for (int i = 2; i >= 0; i--) {
                System.out.println(" Enter the number from 0 to 9 :");
                int entNumber;
                do {
                    entNumber = bordenNumber();
                }

                while (!(0 <= entNumber && entNumber <= 9));

                if (entNumber == randNumber) {
                    System.out.println("YOU WIN!!!");
                    break;
                } else if (entNumber > randNumber) {
                    System.out.println("Your number > !");
                } else System.out.println("Your number < !");
                System.out.println("Left attempt :" + i);
            }
            System.out.println("Play continue? 1 - yes/ 0 - no.");



        }
        while (bordenNumber() != 0) ;
    }



    static int bordenNumber() {
        Scanner scan = new Scanner(System.in);
        do {
            if (scan.hasNextInt()) ;
            {
                return scan.nextInt();
            }


        }
        while (true);



    }



}
