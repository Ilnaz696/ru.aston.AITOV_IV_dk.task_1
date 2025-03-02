package ru.aston.AITOV_IV_dk.task1;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {

        //Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()

        // Создаем массив с числами от 1 до 5
        int[] array = {1, 2, 3, 4, 5};

        // Используем Stream API для вычисления суммы элементов массива
        int sum = Arrays.stream(array) // Преобразуем массив в поток
                .reduce(0, (accumulator, currentValue) -> accumulator + currentValue);

        // Выводим результат в консоль
        System.out.println(sum); // Вывод: 15
    }
}
