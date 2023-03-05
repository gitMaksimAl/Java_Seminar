package Lesson_1;

/**
 * task1
 *  Дан массив двоичных чисел, например [1, 1, 0, 1, 0, 1, 0, 0]. Вывести
 * максимальное количество идущих подряд чисел.
 */

public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        int count = 0;
        int max = 0;

        for (int i: arr) {
            if (i == 1) count++;
            else {
                if (count > max) max = count;
                count = 0;
            }
        }
        System.out.println(count > max ? count: max);
    }
    
}