import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        final int ADMINISTRATIVO = 0;
        final int RECURSOS_HUMANOS = 1;

        Departamento d1 = new Departamento(ADMINISTRATIVO);
        Departamento d2 = new Departamento(RECURSOS_HUMANOS);

        Empregado gerente1 = new Empregado("967675", "Luiz", (float) 6574.98);
        Empregado gerente2 = new Empregado("333", "Paula", (float) 9000.00);

        d1.setGerente(gerente1);
        d2.setGerente(gerente2);
        d1.addEmpregado(gerente1);
        d2.addEmpregado(gerente2);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dados do empregado: ");
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o cpf: ");
            String cpf = sc.next();
            System.out.print("Digite o salário: ");
            float salario = sc.nextFloat();
            System.out.print("Digite o codigo do departamento: ");
            int codigo = sc.nextInt();

            Empregado emp = new Empregado(cpf, nome, salario);

            if(codigo == 0) {
                emp.setDepartamento(d1);
                d1.addEmpregado(emp);
            } 
            else if(codigo == 1) {
                emp.setDepartamento(d2);
                d2.addEmpregado(emp);
            }

            System.out.print("Deseja adicionar mais algum empregado? (s/n) ");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            if(opcao == 'n') 
                break;
        } while(true);

        System.out.println("Empregados do departamento Administrativo: ");
        ArrayList<Empregado> lista = d1.getEmpregados();

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        /*
        for(Empregado e : d1.getEmpregados()) {
            System.out.println(e);
        }
        */

        System.out.println("\nEmpregados do departamento RH: ");
        ArrayList<Empregado> lista2 = d2.getEmpregados();

        for(int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }


    }
}
