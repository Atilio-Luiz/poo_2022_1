import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo tx = new Triangulo();
        Triangulo ty = new Triangulo();

        System.out.print("Enter the measures of triangle X: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        tx.inicializaTriangulo(a, b, c);

        System.out.print("Enter the measures of triangle Y: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        ty.inicializaTriangulo(a, b, c);

        // teste perímetro
        System.out.printf("Triangle X perimeter: %.2f%n", tx.perimetro());
        System.out.printf("Triangle Y perimeter: %.2f%n", ty.perimetro());
        
        System.out.printf("Triangle X area: %.4f%n", tx.area());
        System.out.printf("Triangle Y area: %.4f%n", ty.area());
        
        // teste área
        if(tx.area() > ty.area()) System.out.println("Larger area: X");
        else if(tx.area() < ty.area()) System.out.println("Larger area: Y");
        else System.out.println("X and Y have the same area");
        
        // teste equilátero
        if(tx.ehEquilatero()) System.out.println("X is equilateral");
        else System.out.println("X is not equilateral");
        
        if(ty.ehEquilatero()) System.out.println("Y is equilateral");
        else System.out.println("Y is not equilateral");
    }
}
