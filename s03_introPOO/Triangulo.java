/**
 * A classe Triangulo representa os três
 * lados de um triângulo qualquer
 */
public class Triangulo {
    /**
     * Declaração dos outros campos da classe
     */
    private float lado2, lado3; // só para ilustrar.
                        // eles devem estar todos juntos
    // declaração de um dos campos da classe
    private float lado1;

    Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * O método equilátero verifica se o triângulo
     * é equilátero ou não
     * @return true se triangulo equilátero, false se não 
     */
    boolean ehEquilatero() {
        if((lado1 == lado2) && (lado2 == lado3))
            return true;
        else
            return false;
    }

    /**
     * O método perimetro calcula o peŕimetro do
     * triângulo usando seus lados.
     * @return o perímetro do triângulo representado por esta classe
     */
    float perimetro() {
        int x = 3;
        return lado1 + lado2 + lado3 + x;
    }

}