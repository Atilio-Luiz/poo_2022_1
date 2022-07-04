class ArrayAlg3 {
    public static Comparable min(Comparable[] a) {
    	if(a == null || a.length == 0) return null;
    	Comparable smallest = a[0];
    	for(int i = 1; i < a.length; i++) 
    	    // We know for sure that compareTo is available
    	    if (smallest.compareTo(a[i]) > 0) smallest = a[i];
    	return smallest;
    }
}
