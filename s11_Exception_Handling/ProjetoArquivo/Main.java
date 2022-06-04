import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /** main */
    public static void main(String[] args) throws FileNotFoundException {
        boolean continuarLoop = true;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Informe o nome de arquivo texto: ");
            String nome = entrada.nextLine();

            try {  
                lerArquivo(nome);
                
            }
            catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                
                //System.out.println("erro: " + e);
                //System.out.println("Por favor, digite um nome de arquivo válido");
            }
            catch (Exception e) {
                System.err.println(e); // toString() implicitamente
            }
            
            System.out.print("Deseja continuar? (sim/nao) ");
            String opcao = entrada.next();
            continuarLoop = (opcao.equals("sim")) ? true : false;

        } while (continuarLoop);
    }

    /**
     * Lê o conteúdo de um arquivo e imprime na tela
     */
    public static void lerArquivo (String nome) throws FileNotFoundException {
        File file = new File(nome);
        Scanner entrada = new Scanner(file);
        System.out.println("\nNome do arquivo: " + nome);
        System.out.println("Conteúdo do arquivo texto:");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }
}
