public class Programa16 {
    public static void main(String[] args) {
        final int ANOS = 10;
        final int TAXAS = 6;
        final double INVESTIMENTO = 5000;
        double[][] balanco = new double[ANOS][TAXAS];
        double taxas[] = {0.1, 0.11, 0.12, 0.13, 0.14, 0.15};

        for(int j = 0; j < TAXAS; j++) {
            System.out.printf("%10.0f%%", taxas[j]*100);
            balanco[0][j] = INVESTIMENTO;
        }
        System.out.printf("%n");

        for(int j = 0; j < TAXAS; j++) 
            System.out.printf("%,11.2f", balanco[0][j]);
        System.out.printf("%n");

        for(int i = 1; i < ANOS; i++) {
            for(int j = 0; j < TAXAS; j++) {
                balanco[i][j] = balanco[i-1][j] + balanco[i-1][j] * taxas[j];
                System.out.printf("%,11.2f", balanco[i][j]);
            }
            System.out.printf("%n");
        }
        
    }
}