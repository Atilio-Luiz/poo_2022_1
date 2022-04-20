public class WrapperUnboxing {
    public static void main(String[] args) {
        Double myDouble = -4567.0; // boxing

        double x = myDouble; // unboxing 

        System.out.println("Absolute value of " + myDouble 
            + " = " + Math.abs(x));
    }
}