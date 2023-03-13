package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Напишите метод который удалит все дублирующиеся значения из заданного списка
 * целых чисел.
 */

public class task1 {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 6, 4, 5, 1, 6));
        System.out.println(lst.toString());
        removeDuplicate(lst);
        System.out.println(lst);
    }

    private static void removeDuplicate(List<Integer> source) {
        List<Integer> dublicate = new ArrayList<>();
        int i = 0;
        while (i < source.size()) { // size is volatile
            Integer item = source.get(i);
            if (dublicate.contains(item))
                source.remove(i--); // shift i back, because size decreases 
            else dublicate.add(item);
            i++;
        }
    }
}