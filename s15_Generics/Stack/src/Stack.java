public class Stack<E> {
    private final int size; // número de elementos da pilha
    private int top; // índice do topo
    private E[] elements;

    public Stack() { // o tamanho padrão é 10
        this(10);
    }

    /**
     * Constrói uma pilha com o tamanho especificado
     * @param s tamanho da pilha
     */
    @SuppressWarnings("unchecked")
    public Stack(int s) {
        size = (s > 0) ? s : 10;
        top = -1; // pilha inicia vazia
        elements = (E[]) new Object[size]; // cria o vetor
    }

    public void push(E value) {
        if(isFull()) {
            throw new FullStackException(String.format("Stack is full, cannot push %s", value));
        }
        elements[++top] = value;
    }

    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException("Stack is empty, cannot pop");
        }
        return elements[top--];
    }

    public E top() {
        if(isEmpty()) {
            throw new EmptyStackException("Stack is empty, no top");
        }
        return elements[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size-1;
    }
}
