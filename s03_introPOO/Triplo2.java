public class Triplo2 {
    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();
        inteiro.v = 10;
        tripleValue( inteiro );
        System.out.println(inteiro.v);
    }

    public static void tripleValue(Inteiro x) {
        x.v = 3 * x.v;
    }
}

class Inteiro {
    int v;
}