package Homework_4;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {

    /*
    * Реализовать консольное приложение, которое:
    *   Принимает от пользователя строку вида text~num
    *   Если введено print~num, выводит строку из позиции num в связном списке.
    *   Если введено exit, завершаем программу 
    */

    public static final ArrayList<String> LIST = new ArrayList<>(20);
    public static final String SEP = "~";

    public static void run(Scanner consoleReader) {
        System.out.printf("Eneter line format: <string%sint>\n", SEP);
        String command = consoleReader.nextLine();
        while (!command.equalsIgnoreCase("exit")) {
            String[] data = parser(command);
            switch (data[0]) {
                case "print":
                    if (!pullText(LIST, data)) System.out.println("Try again.");
                    break;
                case "":
                    System.out.println("Try again.");
                    break;
                default:
                    pushText(LIST, data);
                    break;
            }
            command = consoleReader.nextLine();
        }
    
    }

    private static String[] parser(String input) {
        String[] data = input.split(SEP);
        if (data.length < 2 || notInt(data[1])) {
            System.err.println("Wrong input format.");
            data[0] = "";
        }
        return data;
    }

    private static boolean notInt(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    private static void pushText(ArrayList<String> lst, String[] text) {
        int index = Integer.parseInt(text[1]);
        try {
            lst.set(index, text[0]);
        } catch (IndexOutOfBoundsException out) {
            while (lst.size() <= index) lst.add(null);
            System.out.printf("ARRAY SIZE RISED TO %d.\n", lst.size());
            lst.set(index, text[0]);
        }
    }

    private static boolean pullText(ArrayList<String> lst, String[] text) {
        int index = Integer.parseInt(text[1]);
        String data = null;
        try {
            data = lst.get(index);
        } catch (IndexOutOfBoundsException out) {
            System.err.println("Wrong index of array.");
        }
        if (data != null) {
            System.out.println(data);
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    } 
}
