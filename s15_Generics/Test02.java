class ArrayAlg {
    public static <T extends Comparable<T>> T min(T[] a) {
    	if(a == null || a.length == 0) return null;
    	T smallest = a[0];
    	for(int i = 1; i < a.length; i++) 
    	    // We know for sure that compareTo is available
    	    if (smallest.compareTo(a[i]) > 0) smallest = a[i];
    	return smallest;
    }
}

public class Test02 {
	public static void main(String[] args) {
		Integer[] arr = {6,5,3,1,2,7,9,8};

		Integer minimum = min(arr);

		System.out.println("Mínimo: " + minimum);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Integer[] arr = {6,5,3,1,2,7,9,8};

		Integer minimum = (Integer) min(arr);

		System.out.println("Mínimo: " + minimum);
	}
}