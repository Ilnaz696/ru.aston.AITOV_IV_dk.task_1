public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected void next(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}