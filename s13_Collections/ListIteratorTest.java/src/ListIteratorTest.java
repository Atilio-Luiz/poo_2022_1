import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) throws Exception {
        String[] names = {"ana", "martim", "soraya", "vanessa", "thomás", "túlio"};
        LinkedList<String> namesList = new LinkedList<>(Arrays.asList(names));

        System.out.print("List: ");
        print(namesList);

        System.out.print("Reversed list: ");
        printReversed(namesList);

        System.out.print("List with removed element: ");
        removeFromList(namesList, "soraya");
        print(namesList);

        System.out.print("List with removed element: ");
        setList(namesList, "thomás", "bruno");
        print(namesList);
    }

    public static void print(LinkedList<String> lst) {
        ListIterator<String> iterator = lst.listIterator();

        while(iterator.hasNext()) {
            System.out.printf("%s ", iterator.next());
        }
        System.out.println();
    }

    public static void printReversed(LinkedList<String> lst) {
        ListIterator<String> iterator = lst.listIterator(lst.size());

        while(iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }

    public static void removeFromList(LinkedList<String> lst, String obj) {
        ListIterator<String> iterator = lst.listIterator();

        while(iterator.hasNext()) {
            if(iterator.next().equals(obj)) {
                iterator.remove();
            }
        }
    }

    public static void setList(LinkedList<String> lst, String oldObj, String newObj) {
        ListIterator<String> iterator = lst.listIterator();

        while(iterator.hasNext()) {
            if(iterator.next().equals(oldObj)) {
                iterator.set(newObj);
            }
        }
    }
}
