import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) throws Exception {
         
        List<Integer> listaArray = new ArrayList<>();
        List<Integer> listaEncadeada = new LinkedList<>();

        lerLista(listaArray);
        lerLista(listaEncadeada);

        System.out.println("Listas: ");
        System.out.println(listaArray);
        System.out.println(listaEncadeada);

        Collections.sort(listaArray);
        Collections.sort(listaEncadeada);

        System.out.println("Listas ordenadas: ");
        System.out.println(listaArray);
        System.out.println(listaEncadeada);
    }

    public static void lerLista(List<Integer> lst) {
        Scanner sc = new Scanner(System.in);
        boolean continuarLoop = true;
        do {
            try {
                System.out.print("Forneça inteiros separados por espaço: ");
                String line = sc.nextLine();
                Scanner dados = new Scanner(line);
                while(dados.hasNext()) {
                    lst.add( Integer.parseInt(dados.next()) );
                }
                continuarLoop = false;
            }
            catch(NoSuchElementException e) { // CTRL + D
                System.out.println("\nList atual: " + lst);
                continuarLoop = false;
            }
            catch(NumberFormatException e) {
                System.out.println("\nerror: " + e.getMessage());
                System.out.println("List atual: " + lst);
                System.out.println("Por favor, digite inteiros. Tente novamente.");
            }  
        } while(continuarLoop);
    }
}
