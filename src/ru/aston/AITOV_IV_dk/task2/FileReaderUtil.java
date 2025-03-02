package ru.aston.AITOV_IV_dk.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// 1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

public class FileReaderUtil {

    // Метод для чтения текстового файла и возврата его содержимого в виде списка строк
    public static List<String> readFileToList(String filePath) throws IOException {
        Path path = Paths.get(filePath);  // Создаем объект Path из строки с путем к файлу
        return Files.readAllLines(path); // Читаем все строки из файла и возвращаем их в виде списка
    }

    public static void main(String[] args) {
        String pathToFile = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/task2/example.txt";  // путь к файлу - пишем и он ввыводит
        try {
            List<String> lines = readFileToList(pathToFile);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
