/**
 * Classe Conta
 * @author Atilio Gomes
 */
class Conta { // Esta eh a declaracao da classe!

    long numero;     // numero da conta
    String titular;  // nome do titular
    double saldo;    // saldo 
    double limite;   // limite de saque diario

    void sacar(double valor) {
        saldo -= valor;
    }

    void depositar(double valor) {
        saldo += valor;
    }

} // fim da classe