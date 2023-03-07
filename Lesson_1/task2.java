package Lesson_1;

import java.util.Arrays;

/*
Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные
заданному, нужно перенести эти элементы в конец массива. Таким образом, первые
несколько (или все) элементов массива должны быть отличны от заданного, а
остальные - равны ему.
*/

public class task2 {
   public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 5, 5, 3, 1};
        int val = 3;

        System.out.println(Arrays.toString(arr));
        swap(arr, val);
        System.out.println(Arrays.toString(arr));
   } 

   static void swap(int[] array, int value) {
        int size = array.length - 1;
        int offset = 0;
        for (int i = 0; i < size - offset; i++) {
            while (array[size - offset] == value) offset++;
            if (array[i] == value) {
                int temp = array[i];
                array[i] = array[size - offset];
                array[size - offset] = temp;
            }
        }
   }
}
