import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<E> {
    private final ArrayList<E> elements; // ArrayList stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10);
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<E>(initCapacity);
    }

    // push elements onto stack
    public void push(E value) {
        elements.add(value);
    }

    // remove and return the top element if not empty; else throw exception
    public E pop() {
        if(elements.isEmpty()) { // if stack is empty
            throw new NoSuchElementException("Stack is empty, cannot pop");
        }
        // remove and return the top element of Stack
        return elements.remove(elements.size()-1);
    }
}