package Lesson_5;
import java.util.Map;
import java.util.HashMap;

public class task1 {

    /*
     * Проверить что 2 строки являются изоморфными в том смысле что одну букву
     * в первом слове можно заменить на какую-то букву во втором.
     */
    public static void main(String[] args) {
        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("piper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
    }

    static boolean isMatches(String a, String b) {
        Map<Character, Character> dict = new HashMap<>();
        if (a.length() != b.length()) return false;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        for (int i = 0; i < charsA.length; i++) {
            if (dict.containsKey(charsA[i]))
                if (dict.get(charsA[i]) != charsB[i]) return false;
            dict.put(charsA[i], charsB[i]);
        }
        return true;
    }
}
