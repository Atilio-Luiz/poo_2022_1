import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        ArrayList<Manager> listM = new ArrayList<>();
        listM.add(new Manager("Luiz", 2345.67, 234.76));
        listM.add(new Manager("Mara", 786.54, 500));
        listM.add(new Manager("Vera", 999, 790));
        print(listM);

        ArrayList<Employee> listE = new ArrayList<>();
        listE.add(new Employee("Zazá", 6789.99));
        listE.add(new Manager("Zeca", 6789.99, 100.00));
        print(listE);

        System.out.printf("Total salary = %.2f%n", (totalSalaries(listM) + totalSalaries(listE)));
    }

    public static <T> void print(ArrayList<T> list) {
        for(T e : list) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static double totalSalaries(List<? extends Employee> list) {
        double total = 0.0;
        for(Employee e : list) {
            total += e.getSalary();
        }
        return total;
    }
}
