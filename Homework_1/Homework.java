package Homework_1;

import java.util.Arrays;

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */ 

public class Homework {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3]; 

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] array2 =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        zeroInvertOne(array2);
        System.out.printf("Task1:\n%s\n", Arrays.toString(array2));

        // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        riseNeSix(array3);
        System.out.printf("Task2:\n%s\n", Arrays.toString(array3));

        // 3. Создать квадратный двумерный целочисленный массив (количество
        // строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
        int[][] array4 = squareArray(5);
        System.out.println("Task3:");
        for (int[] item: array4) System.out.println(Arrays.toString(item));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int total = Integer.sum(a, b);
        if (total >= 10 && total <= 20) return true;
        return false;
    }

    private static boolean isPositive(int x) {
        if (x > 0) return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        for (int i = 1; i < repeat; i++) System.out.print(source);
        System.out.println(source);
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) return true;
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        int[] newArr = new int[len];
        Arrays.fill(newArr, initalValue);
        return newArr;
    }

    /*
    * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    private static void zeroInvertOne(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) arr[i]++;
                else arr[i]--;
            }
    }

    /*
    *2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
    private static void riseNeSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
    }

    /*
    * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    */
    private static int[][] squareArray(int len) {
        int[][] square = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++)
                if (i == j || j == (len - 1) - i) square[i][j] = 1;
        }
        return square;
    }
}
