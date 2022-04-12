/**
 * Classe Triangulo
 * @author Atilio Luiz
 */
class Triangulo {
    // lados do triângulo
    double a;
    double b;
    double c;

    void inicializaTriangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimetro() {
        return a + b + c;
    }

    double area() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }

    boolean ehEquilatero() {
        return a == b && b == c;
    }
}