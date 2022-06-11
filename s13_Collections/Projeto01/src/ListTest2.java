import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        String[] colors = {"amarelo", "verde", "rosa", "preto", "azul"};
        List<String> colorsList = new LinkedList<>(Arrays.asList(colors));

        String[] removeColors = {"verde", "azul"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        String[] addColors = {"anil", "púrpura", "branco", "vermelho", "laranja"};
        List<String> addList = new ArrayList<>(Arrays.asList(addColors));

        String[] retainColors = {"anil", "rosa", "vermelho", "laranja"};
        List<String> retainList = new LinkedList<>(Arrays.asList(retainColors));

        System.out.printf("colorsList: %s%n", colorsList);
        System.out.printf("removeList: %s%n", removeList);
        System.out.printf("addList: %s%n", addList);
        System.out.printf("retainList: %s%n", retainList);

        colorsList.removeAll(removeList);
        System.out.println("\nLista após remoção de cores: ");
        System.out.println(colorsList);

        colorsList.addAll(addList);
        System.out.println("\nLista após adição de cores: ");
        System.out.println(colorsList);

        colorsList.retainAll(retainList);
        System.out.println("\nLista com cores mantidas:");
        System.out.println(colorsList);

        System.out.println("\nLista com cores ordenadas: ");
        Collections.sort(colorsList);
        System.out.println(colorsList);
    }
}
