/**
 * Classe de exceção que indica quando a pilha está cheia 
 */
public class FullStackException extends Exception {
    // Construtor
    FullStackException() {
        super();
    }
    FullStackException(String msg) {
        super(msg);
    }
    FullStackException(String msg, Throwable obj) {
        super(msg, obj);
    }
    FullStackException(Throwable obj) {
        super(obj);
    }
}
