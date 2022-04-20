import java.util.Locale;

class DemoMathConst {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("PI = " + Math.PI);
        System.out.println("Raiz(2) = " + MathConst.raizDe2);
        System.out.println("Raiz(3) = " + MathConst.raizDe3);
        System.out.println("Raiz(5) = " + MathConst.raizDe5);
        System.out.println("Raiz(6) = " + MathConst.raizDe6);
        System.out.printf("Raiz(10) = %.3f%n", MathConst.raizDe2 * MathConst.raizDe5);
    }
}