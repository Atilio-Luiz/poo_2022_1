class SobrecargaTeste {
	public static <T extends Comparable> T min(T[] a) {
		if(a == null || a.length == 0) 
			return null;
		T smallest = a[0];
		for(int i = 1; i < a.length; i++)
			if(smallest.compareTo(a[i]) > 0) 
				smallest = a[i];
		return smallest;
	}

	public static int min(int[] a) {
		if(a == null || a.length == 0) 
			throw new RuntimeException("vetor vazio");
		int smallest = a[0];
		for(int i = 1; i < a.length; i++)
			if(smallest > a[i]) 
				smallest = a[i];
		return smallest;
	}

	public static void main(String[] args) {
		Short[] arr = new Short[0];
		System.out.println("min = " + min(arr));
		int[] vec = new int[0];
		System.out.println("min = " + min(vec));
	}
}	
