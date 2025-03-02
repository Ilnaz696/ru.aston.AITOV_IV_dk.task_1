package ru.aston.AITOV_IV_dk.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()

        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = Arrays.stream(numbers) // Создаем поток из массива
                .map(n -> n * 2) // Умножаем каждое число на 2
                .toArray(); // Преобразуем поток обратно в массив

        // Выводим результат
        System.out.println(Arrays.toString(result));
    }
}