package Lesson_1;

/*
* Напишите метод, который находит самую длинную строку общего префикса среди
* массива строк. Если общего префикса нет, вернуть пустую строку "".
*/

public class task3 {
    public static void main(String[] args) {
        String[] array = {"abc", "abceff", "abudbi", "abcrtq"};
        String commonPrefix = findPrefix(array);

        System.out.println(commonPrefix);
    }

    static String findPrefix(String[] array) {
        String prefix = "";
        int shortest = array[0].length();
        for (int i = 1; i < array.length; i++) {
            int len = array[i].length();
            if (len < shortest) shortest = len;
        }

        int index = 0;
        boolean match = true;
        for (int i = 0; i < shortest; i++, index++) {
            char comparedChar = array[0].charAt(index);
            for (int j = 1; j < array.length; j++) {
                if (comparedChar != array[j].charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (!match) break;
            prefix += comparedChar;
        }
        return prefix;
    }
}