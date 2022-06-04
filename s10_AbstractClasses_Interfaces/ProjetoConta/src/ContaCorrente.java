public class ContaCorrente implements Conta {
    private double saldo;
    private final double TAXA_OPERACAO = 0.45;

    @Override
    public void depositar (double valor) {
        this.saldo += valor - TAXA_OPERACAO;
    }

    @Override
    public void sacar (double valor) {
        this.saldo -= valor + TAXA_OPERACAO;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
