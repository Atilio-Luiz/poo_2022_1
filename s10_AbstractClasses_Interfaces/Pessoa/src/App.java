import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        System.out.println("Quantas pessoas? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.print("nome: ");
            String nome = sc.next();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            Pessoa p = new Pessoa(idade, nome);
            lista.add(p);
        }

        Collections.sort(lista);

        for(Pessoa p : lista) {
            System.out.println(p.getNome());
        }

        ComparaIdades comparador = new ComparaIdades();

        Collections.sort(lista, comparador);

        for(Pessoa p : lista) {
            System.out.printf("idade: %d, nome: %s%n", 
                p.getIdade(), p.getNome());
        }

    }
}
