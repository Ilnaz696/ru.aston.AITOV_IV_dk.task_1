package ru.aston.AITOV_IV_dk.task1.patterns.behavioural;

import java.util.logging.Handler;

public class Client {
    public static void main(String[] args) {
        // Создаем обработчиков
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // Устанавливаем цепочку
        handlerA.setLevel(handlerB.getLevel());
        handlerB.setLevel(handlerC.getLevel());

        // Тестируем цепочку
        System.out.println("Sending request A:");
        ((ConcreteHandlerA) handlerA).handleRequest("A");

        System.out.println("\nSending request B:");
        ((ConcreteHandlerA) handlerA).handleRequest("B");

        System.out.println("\nSending request C:");
        ((ConcreteHandlerA) handlerA).handleRequest("C");

        System.out.println("\nSending request D (no handler):");
        ((ConcreteHandlerA) handlerA).handleRequest("D");
    }
}
