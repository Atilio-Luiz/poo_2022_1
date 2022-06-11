// Collection interface demonstrated via an ArrayList object
import java.util.List; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        // add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for(String color : colors) {
            list.add(color);
        }

        // add elements in removeColors array to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for(String color : removeColors) {
            removeList.add(color);
        }

        // output list contents
        System.out.println("ArrayList: " + list); // call toString implicitly

        // remove from list the colors contained in removeList
        removeColors(list, removeList);

        // output list contents
        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for(String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    // remove colors specified in collection 2 from collection1
    private static void removeColors(Collection<String> col1, Collection<String> col2) {
        // get iterator
        Iterator<String> iterator = col1.iterator();

        // loop while collection has items
        while(iterator.hasNext()) {
            if(col2.contains(iterator.next())) {
                iterator.remove(); // remove current element
            }
        }
    }
}