import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService brazil = new BrazilInterestService(2.0);
        InterestService usa = new UsaInterestService(1.0);

        System.out.printf("Payment after %d months (Brazil): %.2f%n", 
            months, brazil.payment(amount, months));
        System.out.printf("Payment after %d months (USA): %.2f%n", 
            months, usa.payment(amount, months));
    }
}
