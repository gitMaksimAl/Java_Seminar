package Homework_2;
import java.lang.IllegalArgumentException;

/*
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
 * строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с
 * c1. (6, 'a', 'b') -> "ababab" 
 */

public class task1 {
    public static void main(String[] args) {
        try {
            System.out.println(buildEvenString(6, 'a', 'b'));
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal arguments.");
        }
    }

    public static String buildEvenString(int len, char ch1, char ch2) throws IllegalArgumentException {
        if (len <= 0)
            throw new IllegalArgumentException("Zero length.");
        else if (len % 2 != 0)
            throw new IllegalArgumentException("Not even length.");
        else {
            char[] str = {ch1, ch2};
            StringBuilder result = new StringBuilder(len);
            for (int i = 0; i < len; i += 2) {
                result.append(str);
            }
            return result.toString();
        }
    }
}
