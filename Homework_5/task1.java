package Homework_5;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

public class task1 {
    public static Map<Integer, ArrayList<String>> DICT = new HashMap<>();
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг " +
        "прелестный Пора красавица проснись";
        System.out.println(text);
        fillMap(text);
        System.out.println(DICT.toString());
    }

    public static void fillMap(String text) {
        String[] words  = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (DICT.containsKey(len)) DICT.get(len).add(words[i]);
            else DICT.put(len, new ArrayList<>(List.of(words[i])));
        }
    }
}
