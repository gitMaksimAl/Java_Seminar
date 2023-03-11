package Lesson_2;
import java.lang.StringBuilder;

public class task1 {
    public static void main(String[] args) {
        String str = "aabccdddeffff";
        
        System.out.println(str);
        System.out.println(compress(str));
    }

    public static String compress(String source) {
        int len = source.length();
        int count = 0;
        if (len == 0) return "";
        else count = 1;
        StringBuilder compressed = new StringBuilder();
        char letter = source.charAt(0);
        for (int i = 1; i < len; i++) {
            if (letter == source.charAt(i)) count++;
            else {
                compressed.append(letter);
                letter = source.charAt(i);
                if (count > 1) {
                    compressed.append(count);
                    count = 1;
                }
            }
        }
        compressed.append(letter);
        if (count > 1) compressed.append(count);
        return compressed.toString();
    }
}