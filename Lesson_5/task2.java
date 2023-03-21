package Lesson_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

public class task2 {
    public static Map<Character, Character> DICT = Map.of(
        '(', ')',
        '[', ']',
        '{', '}',
        '<', '>'
    );
    public static void main(String[] args) {
        int i = 17;
        System.out.printf("Line %d\t%s\n", i++, isCorrect("()"));
        System.out.printf("Line %d\t%s\n", i++, isCorrect("{(>}"));
        System.out.printf("Line %d\t%s\n", i++, isCorrect("{{<}}"));
        System.out.printf("Line %d\t%s\n", i++, isCorrect("<()>"));
        System.out.printf("Line %d\t%s\n", i++, isCorrect("{<()))"));
        System.out.printf("Line %d\t%s\n", i++, isCorrect("({)}"));
    }

    public static boolean isCorrect(String sequence) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] symbols = sequence.toCharArray();
        if (symbols.length % 2 != 0) {
            return false;
        }
        for (char ch: symbols) {
            if (DICT.containsKey(ch)) stack.add(ch);
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character last = stack.pollLast();
                if (!Objects.equals(DICT.get(last), ch)) return false;
            }
        }
        return stack.isEmpty();
    }
}
