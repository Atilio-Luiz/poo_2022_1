import java.util.Scanner;

public class CreateWrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer myInt = Integer.valueOf(input.nextInt()); 
        Integer myInt2 = myInt;
        Double myDouble = Double.valueOf(5.99); 
        Character myChar = Character.valueOf('A'); 

        System.out.println(myInt); // chama toString() 
        System.out.println(myInt2); // chama toString()
        System.out.println(myDouble); // chama toString()
        System.out.println(myChar); // chama toString()
    }
}