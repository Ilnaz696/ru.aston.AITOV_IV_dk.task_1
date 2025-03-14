package ru.aston.AITOV_IV_dk.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 2.	 Написать метод, который записывает в файл строку, переданную параметром.

public class FileWriterUtil {

    // Метод для записи строки в файл
    public static void writeStringToFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath); // Создаем объект Path из строки с путем к файлу
        Files.writeString(path, content); // Записываем строку в файл (перезаписывает файл, если он существует)
    }

    public static void main(String[] args) {
        String pathToFile = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/task2/output.txt"; // / путь к файлу - который будем записывать строку
        String contentToWrite = "Привет, мир! Это строка, записанная в файл."; // Содержимое, которое нужно записать в файл

        try {
            writeStringToFile(pathToFile, contentToWrite); // Вызываем метод для записи строки в файл
            System.out.println("Строка успешно записана в файл: " + pathToFile); // Сообщаем об успешной записи
        } catch (IOException e) { // Обрабатываем исключение, если возникла ошибка при записи в файл
            System.err.println("Ошибка при записи в файл: " + e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
