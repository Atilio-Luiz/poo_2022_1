import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1400);
        cp.sacar(400);

        geradorConta(cc);
        geradorConta(cp);
    }

    public static void geradorConta (Conta conta) {
        Locale.setDefault(Locale.US);
        System.out.printf("Saldo atual: %.2f%n", conta.getSaldo()); 
    }
}
