import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /**
     * O atributo 'recordFilePath' contém o caminho absoluto para o arquivo texto onde serão
     * guardados os dados cadastrados. O método System.getProperty("user.home") retorna uma 
     * string contendo o caminho para o diretorio principal (home) da máquina.
     */
    static String recordFilePath = System.getProperty("user.home") + "/data.txt";
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception 
    {
        List<Person> listPerson = readDataFromFile(recordFilePath);        
        
        int option = 0;
        while(option != 3) {
            option = menu();
            switch(option) {
                case 1:
                    addData(listPerson);
                    break;
                case 2:
                    showData(listPerson);
                    break;
                case 3:
                    recordDataInFile(listPerson, recordFilePath);
                    break;
                default:
                    System.out.println("fail: opcao invalida");
                    break;
            }
        }
    }

    /**
     * Mostra um menu na tela
     * @return a opção escolhida pelo usuário
     */
    public static int menu() {
        System.out.println("-------------------------------");
        System.out.println("Programa de cadastro de pessoas");
        System.out.println("-------------------------------");
        System.out.println("Opções:");
        System.out.println("1. Incluir");
        System.out.println("2. Mostrar todos");
        System.out.println("3. Sair");
        System.out.print("Digite sua opção: ");
        int result = input.nextInt();
        input.nextLine();
        return result;
    }

    public static List<Person> readDataFromFile(String fileName) {
        List<Person> listPerson = new ArrayList<>();
        // Se o arquivo data.txt existir, abre o arquivo e lê todos os dados contidos nele
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String[] arr = line.split(";");
                Person p = new Person(arr[0],arr[1],Integer.valueOf(arr[2]));
                listPerson.add(p);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("nenhum arquivo inicial \'data.txt\' para ser carregado");
        }
        return listPerson;
    }

    public static void recordDataInFile(List<Person> listPerson, String fileName) throws IOException {
        FileWriter fstream = new FileWriter(fileName);
        PrintWriter outputFile = new PrintWriter(fstream);
        for(Person p : listPerson) {
            outputFile.printf("%s;%s;%s%n", p.getCpf(), p.getName(), p.getAge());
        }
        outputFile.close();
    }

    public static void addData(List<Person> listPerson) {
        System.out.println("-------------------");
        System.out.println("Inclusão de pessoa:");
        System.out.print("Digite o cpf: ");
        String cpf = input.next();
        input.nextLine();
        System.out.print("Digite o nome: ");
        String name = input.nextLine();
        System.out.print("Digite a idade: ");
        int age = input.nextInt();
        listPerson.add(new Person(cpf, name, age));
    }

    public static void showData(List<Person> listPerson) {
        if(listPerson.isEmpty()) {
            System.out.println("fail: não há pessoas cadastradas");
        }
        else {
            System.out.println("-----------------");
            System.out.println("Lista de pessoas:");
            for(Person p : listPerson)
                System.out.println(p);
            System.out.println("-----------------");
        }
        System.out.println("tecle algo para continuar...");
        input.nextLine();
    }
}
