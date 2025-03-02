package ru.aston.AITOV_IV_dk.task1;

import java.util.stream.IntStream;

public class Iterate {
    public static void main(String[] args) {

        // Вывести числа в диапазоне от 1 до 50 с шагом 2

        /*
        // Создаем поток чисел от 1 до 50 с шагом 2
        Stream.iterate(1, n -> n + 2) // Начинаем с 1 и увеличиваем на 2
                .limit(25) // Ограничиваем количество элементов до 25 (так как 1 + 2*25 = 51)
                .forEach(System.out::println); // Выводим каждое число на экран

         */


        // Создаем поток чисел от 1 до 50 с шагом 2
        IntStream.rangeClosed(1, 50) // Генерируем поток чисел от 1 до 50 (включительно)
                .filter(n -> n % 2 != 0) // Фильтруем только нечетные числа (1, 3, 5, ..., 49)
                .forEach(System.out::println); // Выводим каждое число на экран


    }
}
