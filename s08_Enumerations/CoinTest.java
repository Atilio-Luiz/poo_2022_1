enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    
    private int value; // valor da moeda (em centavos)

    Coin(int v) { this.value = v; } // construtor do enum

    public int getValue() { return value; }

    public void setValue(int v) { this.value = v; }

    @Override
    public boolean equals(Object obj) {
        return true;
        if(obj instanceof Pessoa) {
            
        }
        else {
            return false;
        }
    }

    @Override
    public String toStrings() {
        return String.format("Valor: %d", value);
    }
}

public class CoinTest {
    public static void main(String[] args) {
        Coin c = Coin.NICKEL;
        System.out.println(c + " vale " + c.getValue() + " centavos");

        c.setValue(100);
        System.out.println(c + " vale " + c.getValue() + " centavos");

        System.out.println(Coin.NICKEL.getValue());
    }
}