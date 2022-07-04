public class FullStackException extends RuntimeException {
    public FullStackException() {
        this("Stack is full");
    }

    public FullStackException(String msg) {
        super(msg);
    }
}
