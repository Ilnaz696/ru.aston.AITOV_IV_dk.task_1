package ru.aston.AITOV_IV_dk.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’

public class FileCharacterReplacer {

    // Метод для замены всех символов, кроме букв и цифр, на знак '$'
    public static void replaceNonAlphanumericWithDollar(String filePath) throws IOException {
        Path path = Paths.get(filePath); // Создаем объект Path из строки с путем к файлу
        String content = Files.readString(path); // Читаем содержимое файла в строку

        // Заменяем все символы, кроме букв и цифр, на знак '$'
        String modifiedContent = content.replaceAll("[^a-zA-Z0-9]", "$");

        // Записываем измененное содержимое обратно в файл
        Files.writeString(path, modifiedContent);
    }

    public static void main(String[] args) {
        String pathToFile = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/task2/example.txt\";"; // путь к текстовому файлу

        try {
            replaceNonAlphanumericWithDollar(pathToFile); // Вызываем метод для замены символов
            System.out.println("Замена символов завершена успешно."); // Сообщаем об успешной замене
        } catch (IOException e) { // Обрабатываем исключение, если возникла ошибка
            System.err.println("Ошибка при обработке файла: " + e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
