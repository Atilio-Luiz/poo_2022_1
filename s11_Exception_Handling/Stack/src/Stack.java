/**
 * Classe que implementa a estrutura de dados pilha (stack)
 */
public class Stack {
    private int indexTop;
    private final Object items[];

    /**
     * Construtor, cria uma pilha vazia
     * @param capacity a capacidade total da pilha
     */
    Stack(int capacity) {
        indexTop = -1;
        items = new Object[capacity];
    }

    /**
     * Adiciona um elemento no topo da pilha
     * @param obj elemento a ser adicionado na pilha
     * @throws FullStackException
     */
    void push(Object obj) throws FullStackException {
        if(items.length == indexTop + 1) {
            throw new FullStackException("fail: stack overflow");
        }
        indexTop++;
        items[indexTop] = obj; 
    }

    /**
     * Remove elemento do topo e retorna seu valor
     * @return elemento removido do topo
     * @throws EmptyStackException
     */
    Object pop() throws EmptyStackException {
        if(indexTop == -1) {
            throw new EmptyStackException("fail: stack underflow");
        }
        indexTop--;
        return items[indexTop + 1];
    }
}
