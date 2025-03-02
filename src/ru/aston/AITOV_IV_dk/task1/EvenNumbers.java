package ru.aston.AITOV_IV_dk.task1;

import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {

       // Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2

        IntStream.rangeClosed(1, 100) // Создаем поток чисел от 1 до 100
                .filter(n-> n % 2 == 0)  // Фильтруем, оставляя только четные числа
                .forEach(System.out::println); // Выводим каждое четное число на консоль
    }
}