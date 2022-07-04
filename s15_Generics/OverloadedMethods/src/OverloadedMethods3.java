public class OverloadedMethods3 {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray = {'H','E','L','L','O'};

        System.out.printf("Array integerArray contains: ");
        printArray(integerArray); // pass an Integer array
        System.out.printf("Array integerArray contains [2 até 4]: ");
        printArray(integerArray, 2, 4); // pass an Integer array
        System.out.printf("Array doubleArray contains: ");
        printArray(doubleArray); // pass a Double array
        System.out.printf("Array characterArray contains: ");
        printArray(characterArray); // pass a Character array
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) 
            System.out.printf("%s ", element.toString());
        System.out.println();
    }

    public static <T> void printArray(T[] inputArray, int low, int high) {
        if(low < 0 || high >= inputArray.length) {
            throw new RuntimeException("índices inválidos");
        }
        for(int i = low; i <= high; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println();
    }
}
