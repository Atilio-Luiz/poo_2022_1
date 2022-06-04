public interface InterestService {
    /**
     * retorna a taxa de juros do serviço
     */
    double getInterestRate(); // abstract method
    /**
     * retorna o valor final a ser pago já com os
     * juros contabilizados
     */
    default double payment(double amount, int months) {
        return amount * Math.pow((1.0 + getInterestRate()/100.0), months);
    }
}