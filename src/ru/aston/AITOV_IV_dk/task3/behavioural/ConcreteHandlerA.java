package ru.aston.AITOV_IV_dk.task1.patterns.behavioural;

import java.util.logging.LogRecord;

public class ConcreteHandlerA extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A is handling the request: " + request);
        } else {
            next(request);
        }
    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}

