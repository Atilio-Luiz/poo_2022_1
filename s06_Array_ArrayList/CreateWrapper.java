import java.util.Scanner;

public class CreateWrapper {
    public static void main(String[] args) {
        Integer myInt = Integer.valueOf(13);

        System.out.println(myInt); // invoca toString()

        int soma = myInt.intValue() + 3;

        System.out.println(soma); // imprime 16
    }
}