package Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Дан список ArrayList<String>. Удалить из него все строки, которые являются 
 * числами.
 */

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(List.of(
            "String",
            "s",
            "5",
            "my_value",
            "10",
            "string2",
            "-12"
        ));
        System.out.println(lst.toString());
        removeNums(lst);
        System.out.println(lst.toString());
    }

    public static void removeNums(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            try {
                Integer.parseInt(iterator.next());
                iterator.remove();
            } catch (NumberFormatException notnum) {
                continue;
            }
        }
    }
}
