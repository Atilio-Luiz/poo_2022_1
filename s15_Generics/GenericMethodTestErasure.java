public class GenericMethodTestErasure {
	public static void printArray(Object[] array) {
		for(Object element : array)
			System.out.printf("%s ", element);
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] integerArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3};
		Character[] charArray = {'o','l','á'};

		System.out.println("\nintegerArray contains:");
		printArray(integerArray);
		System.out.println("\ndoubleArray contains:");
		printArray(doubleArray);
		System.out.println("\ncharArray contains:");
		printArray(charArray);
	}
}
