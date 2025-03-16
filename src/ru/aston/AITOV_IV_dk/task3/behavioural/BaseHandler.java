package ru.aston.AITOV_IV_dk.task1.patterns.behavioural;

import java.util.logging.Handler;

public abstract class BaseHandler extends Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected void next(String request) {
        if (nextHandler != null) {
            nextHandler.flush();
        }
    }

    public abstract void handleRequest(String request);
}