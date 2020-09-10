package ru.geekbrains.skryabinegor;

import java.util.Arrays;
//   Домашнее задание №2
public class Main {
    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    */
    public static void main(String[] args) {
        // 1.
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(mass));
        altermass(mass);
        System.out.println(Arrays.toString(mass));

        // 2.
        int[] mass2 = new int[8];
        System.out.println(Arrays.toString(mass2));
        fillmass2(mass2);
        System.out.println(Arrays.toString(mass2));

        // 3.
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mass3));
        dblmass(mass3);
        System.out.println(Arrays.toString(mass3));

        // 4.
        int[][] mass4 = new int[4][4];
        // System.out.println(Arrays.toString(mass4));
        printmass4(mass4);
        squaremass(mass4);
        // System.out.println(Arrays.toString(mass4));
        printmass4(mass4);

        // 5.
        int[] mass5 = {1, 4, 7, 9, 0};
        System.out.println(Arrays.toString(mass5));
        lesbigmass(mass5);

        // 6.
        int[] mass6 = {1, 6, 6, 6, 6, 6};
        System.out.println(Arrays.toString(mass6));
        boolean isBalanced = hasBalance(mass6);
        System.out.println(isBalanced);

        // 7.
        int[] mass7 = { 2, 7, 8, 3, 5, 6 };
        System.out.println(Arrays.toString(mass7));
        shiftmass7(mass7);
        System.out.println(Arrays.toString(mass7));



    }

    // 1.
    static void altermass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else if (mass[i] == 0) {
                mass[i] = 1;
            }


        }
    }

    // 2.
    static void fillmass2(int[] mass2) {


        for (int i = 0; i < mass2.length; i++) {

            mass2[i] = i * 3;
        }

    }

    // 3.
    static void dblmass(int[] mass3) {
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] % 2 == 0) {
                mass3[i] *= 2;
            } else ;

        }

    }

    // 4.
    static void printmass4(int[][] mass4) {
        for (int i = 0; i < mass4.length; i++) {
            System.out.println(Arrays.toString(mass4[i]));
        }
    }

    static void squaremass(int[][] mass4) {
        for (int i = 0; i < mass4.length; i++) {
            mass4[i][i] = 1;
            mass4[i][mass4[i].length - 1 - i] = 1;


        }

    }

    // 5.
    static void lesbigmass(int[] mass5) {
        int max = mass5[0];
        int min = mass5[0];
        for (int i = 0; i < mass5.length; i++) {

            if (max < mass5[i]) {
                max = mass5[i];
            }
            if (min > mass5[i]) {
                min = mass5[i];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }

    // 6.
    static boolean hasBalance(int[] mass6)
    {
        int leftS = 0;
        for (int i = 0; i < mass6.length; i++) {

            leftS += mass6[i];

            int rightS = 0;
            for (int j = (i + 1); j < mass6.length; j++) {
                rightS += mass6[j];

            }
            if (leftS == rightS) {
                return true;
            }
        }
        return false;
    }

         // 7.
    static void shiftmass7(int[] mass7){
        int buff = mass7[0];
        mass7[0] = mass7[mass7.length - 1];

        for(int i = 1; i < (mass7.length - 1); i++){
            mass7[mass7.length - i] = mass7[mass7.length - i - 1];
        }
        mass7[1] = buff;
    }


}

















