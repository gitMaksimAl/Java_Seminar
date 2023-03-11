package Homework_2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedOutputStream;

/*
 * Создать файл с названием file.txt. Если файл уже есть, то создавать не надо
 * Записать в него Слово "TEXT" 100 раз 
 */

public class task2 {
    public static void main(String[] args) {
        String outFile = "file.txt";
        String word = "TEXT";
        try {
            writeText2(checkFile(outFile), word);
        } catch (IOException e) {
            System.err.println("Failed to write data to file.");
        }
    }

    public static Path checkFile(String filename) {
        Path file = Path.of(filename);
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
                System.out.println("File created.");
                return file;
            } catch (IOException error) {
                System.err.println("Cant create file.");
                return null;
            }
        } else {
            System.out.println("File exist.");
            return file;
        }
    }

    /**
     * @param filename
     * @param text
     * @throws IOException
     */
    public static void writeText2(Path filename, String text) throws IOException {
        byte[] data = text.getBytes(StandardCharsets.UTF_8);
        int buffSize = data.length * 100;
        try (BufferedOutputStream stream = new BufferedOutputStream(Files.newOutputStream(filename))) {
            System.out.printf("Buffer with size %d created.\n", buffSize);
            for (int i = 0; i < 100; i++) stream.write(data);
            stream.flush();
            System.out.println("Data writen.");
        }
    }
}

