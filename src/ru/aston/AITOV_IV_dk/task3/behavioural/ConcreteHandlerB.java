package ru.aston.AITOV_IV_dk.task1.patterns.behavioural;

import java.util.logging.LogRecord;

public class ConcreteHandlerB extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B is handling the request: " + request);
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
