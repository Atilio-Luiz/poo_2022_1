/**
 * Classe de exceção que indica quando a pilha está vazia 
 */
public class EmptyStackException extends Exception {
    // Construtor
    EmptyStackException() {
        super();
    }
    EmptyStackException(String msg) {
        super(msg);
    }
    EmptyStackException(String msg, Throwable obj) {
        super(msg, obj);
    }
    EmptyStackException(Throwable obj) {
        super(obj);
    }
}
