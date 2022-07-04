import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double[] dArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        int[] iArray = {1,2,3,4,5,6,7,8,9};

        Stack<Integer> iStack = 
            new Stack<Integer>(iArray.length); 
        Stack<Double> dStack = 
            new Stack<Double>(dArray.length); 

        for(double d : dArray) 
            dStack.push(Double.valueOf(d));

        for(int i : iArray) 
            iStack.push(Integer.valueOf(i));

        while(!iStack.isEmpty()) {
            System.out.printf("%d ", iStack.pop());
        }
        System.out.println();

        while(!dStack.isEmpty()) {
            System.out.printf("%.1f ", dStack.pop());
        }
        System.out.println();
        
    }
}
