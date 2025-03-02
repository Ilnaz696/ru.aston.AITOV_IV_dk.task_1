package ru.aston.AITOV_IV_dk.task1;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {

        // Отсортировать элементы массива [1, 3, 5, 7, 9] по возрастанию

    // Создаем массив с числами
    int[] array = {1, 3, 5, 7, 9};

    // Используем Stream API для сортировки массива
    int[] sortedArray = Arrays.stream(array) // Преобразуем массив в поток
            .sorted() // Сортируем элементы по возрастанию
            .toArray(); // Преобразуем поток обратно в массив

    // Выводим отсортированный массив
        System.out.println(Arrays.toString(sortedArray)); // Вывод: [1, 3, 5, 7, 9]
}
}
