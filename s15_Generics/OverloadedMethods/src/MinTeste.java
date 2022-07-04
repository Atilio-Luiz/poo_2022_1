import java.util.Arrays;

public class MinTeste {
    public static void main(String[] args) {
        Integer[] integerArray = {3,6,5,4,0,9,87,7,6};
        System.out.println("Array: " + Arrays.toString(integerArray));
        System.out.println("minimo = " + min(integerArray));
    }

    public static <T extends Comparable<T>> T min(T[] elements) {
        if(elements == null || elements.length == 0) 
            return null;
        T minimo = elements[0];
        for(int i = 1; i < elements.length; i++) {
            if(minimo.compareTo(elements[i]) > 0) {
                minimo = elements[i];
            }
        }
        return minimo;
    }
}
