import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for(int i = 1; i <= n; ++i) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle, circle or triangle (r/c/t) ? ");
            char shape = sc.next().charAt(0);
            if(shape == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                String strColor = sc.next();
                Color color = Color.valueOf(strColor);
                System.out.print("X1 e Y1: ");
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                System.out.print("X2 e Y2: ");
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                list.add(new Rectangle(new Point(x1,y1), new Point(x2,y2), color));
            }
            else if(shape == 'c') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                String strColor = sc.next();
                Color color = Color.valueOf(strColor);
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                System.out.print("X e Y: ");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                list.add(new Circle(radius, new Point(x,y), color));
            }
            else if(shape == 't') {
                // fazer
            }
            else {
                System.out.println("Opção inválida");
            }
        }

        System.out.println("\n\nSHAPE AREAS:");
        for(Shape shape : list) {
            if(shape instanceof AbstractShape) {
                AbstractShape s = (AbstractShape) shape;
                System.out.printf("%s, area: %.2f, perimeter: %.2f, color: %s%n",
                    s.toString(), s.area(), s.perimeter(), s.getColor());
            }
            else {
                System.out.printf("%s, area: %.2f, perimeter: %.2f%n",
                    shape.toString(), shape.area(), shape.perimeter());
            }
        }
    }
}
