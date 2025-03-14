package ru.aston.AITOV_IV_dk.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// 3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.

public class FileMerger {

    // Метод для чтения файла и возврата его содержимого в виде списка строк
    public static List<String> readFileToList(String filePath) throws IOException {
        Path path = Paths.get(filePath); // Создаем объект Path из строки с путем к файлу
        return Files.readAllLines(path); // Читаем все строки из файла и возвращаем их в виде списка
    }

    // Метод для записи строки в файл
    public static void writeStringToFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath); // Создаем объект Path из строки с путем к файлу
        Files.writeString(path, content); // Записываем строку в файл (перезаписывает файл, если он существует)
    }

    // Метод для объединения содержимого двух файлов в один
    public static void mergeFiles(String file1Path, String file2Path, String outputFilePath) throws IOException {
        List<String> file1Lines = readFileToList(file1Path); // Читаем строки из первого файла
        List<String> file2Lines = readFileToList(file2Path); // Читаем строки из второго файла

        // Создаем новый StringBuilder для объединения содержимого обоих файлов
        StringBuilder mergedContent = new StringBuilder();

        // Добавляем содержимое первого файла
        for (String line : file1Lines) {
            mergedContent.append(line).append(System.lineSeparator()); // Добавляем строку и перевод строки
        }

        // Добавляем содержимое второго файла
        for (String line : file2Lines) {
            mergedContent.append(line).append(System.lineSeparator()); // Добавляем строку и перевод строки
        }

        // Записываем объединенное содержимое в выходной файл
        writeStringToFile(outputFilePath, mergedContent.toString());
    }

    public static void main(String[] args) {
        String file1Path = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/task2/file1.txt";; // Путь к первому файлу
        String file2Path = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/task2/file2.txt"; // Путь ко второму файлу
        String outputFilePath = "/Users/aitov_ilnaz/ru.aston.AITOV_IV_dk.task1/Intencive/out/production/Intencive/ru/aston/AITOV_IV_dk/merged_output.txt"; // Путь к выходному файлу

        try {
            mergeFiles(file1Path, file2Path, outputFilePath); // Вызываем метод для объединения файлов
            System.out.println("Файлы успешно объединены в: " + outputFilePath); // Сообщаем об успешном объединении
        } catch (IOException e) { // Обрабатываем исключение, если возникла ошибка
            System.err.println("Ошибка при объединении файлов: " + e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
