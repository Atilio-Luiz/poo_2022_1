import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) throws Exception {
        String[] nadadores = {"martin", "lucas", "saulo", "cesar"};
        String[] casados = {"mauro", "lucas", "cesar", "pedro"};

        Set<String> setNadadores = 
            new HashSet<>(Arrays.asList(nadadores));
        Set<String> setCasados = 
            new HashSet<>(Arrays.asList(casados));

        System.out.println("Nadadores: " + setNadadores);

        System.out.println("\nCasados: " + setCasados);
        
        System.out.print("\nNadadores ou casados: ");
        Set<String> todos = new HashSet<>(setCasados);
        todos.addAll(setNadadores);
        System.out.println(todos);

        System.out.print("\nNadadores que são casados: ");
        Set<String> nadadoresCasados = new HashSet<>(setNadadores);
        nadadoresCasados.retainAll(setCasados);
        System.out.println(nadadoresCasados);

        System.out.print("\nNadadores solteiros: ");
        Set<String> nadadoresSolteiros = new HashSet<>(setNadadores);
        nadadoresSolteiros.removeAll(setCasados);
        System.out.println(nadadoresSolteiros);
        
    }
}
