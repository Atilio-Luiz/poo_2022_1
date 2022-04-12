public class Swap2 {
    public static void main(String[] args) {
        Empregado a = new Empregado();
        Empregado b = new Empregado();
        a.nome = "Alice";
        b.nome = "Bob";
        swap(a, b);
        System.out.printf("%s %s%n", a.nome, b.nome);
    }

    /**
     * O método swap muda o estado dos objetos x e y 
     * passados por parâmetro. Os nomes dos dois
     * objetos são trocados.
     * @param x referência para objeto do tipo Empregado
     * @param y referência para objeto do tipo Empregado
     */
    public static void swap(Empregado x, Empregado y) {
        String temp = x.nome;
        x.nome = y.nome;
        y.nome = temp;
    }
}

class Empregado {
    String nome;
}