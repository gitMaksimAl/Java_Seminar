package Homework_3;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа. 
 */

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(lst.toString());
        removeOdd(lst);
        System.out.println(lst.toString());
    }

    public static void removeOdd(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) list.remove(i--);
        }
    }
}
