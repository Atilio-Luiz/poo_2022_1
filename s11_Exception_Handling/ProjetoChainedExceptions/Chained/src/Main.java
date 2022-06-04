import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fileOpened = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite o nome do arquivo: ");
            String fileName = input.next();
            File file = new File(fileName);
            try(Scanner sc = new Scanner(file)) {
                System.out.println("\nConteúdo do arquivo:");
                while(sc.hasNext()) {
                    String[] str = sc.nextLine().split(";");
                    System.out.println("Nome: " + str[0]);
                    System.out.println("Idade: " + str[1]);
                    System.out.println("Saldo: " + str[2]);
                    System.out.println();
                }
                fileOpened = true;
            }
            catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } while(!fileOpened);
        
    }
}
