# Números Complexos

![](figura.png)


Os números complexos são números compostos por uma **parte real** e **uma parte imaginária**. Eles representam o conjunto de todos os pares ordenados (x, y), cujos elementos pertencem ao conjunto dos números reais (`ℝ`).

A forma mais usual de representar números complexos é utilizando a forma algébrica. A forma algébrica, de um número complexo `z` é:

`z = a + bi`

onde:

- x é um número real indicado por: `x = Re(z)`, sendo a parte real de z.
- y é um número real indicado por: `y = Im(z)`, sendo a parte imaginária de z.

**Sua tarefa nesta atividade é:** Escrever em Java a classe *NumeroComplexo* que represente um número complexo. Seu sistema deve ter pelo menos duas classes, a classe *NumeroComplexo* e a classe *Manual*

***

## Requisitos
A classe deverá ter os seguintes métodos:

- **construtor**: que recebe dois valores de ponto flutuante como argumentos para inicializar os campos da classe (parte real e imaginária)

- **toString**: que deve retornar uma String contendo o número complexo encapsulado usando a notação `a + bi` onde `a` é a parte real e `b` a imaginária.

- **equals**: que recebe outra instância da classe **NumeroComplexo** e retorna *true* se os valores dos campos encapsulados forem iguais aos da instância passada como argumento.

- **sum**: que recebe outra instância da classe **NumeroComplexo** e soma este número complexo com o encapsulado usando a fórmula:
    - `(a + bi) + (c + di) = (a + c) + (b + d)i`

- **subtract**: que recebe outra instância da classe **NumeroComplexo** e subtrai o argumento do número complexo encapsulado usando a fórmula:
    - `(a + bi) − (c + di) = (a − c) + (b − d)i`

- **multiply**: que recebe outra instância da classe **NumeroComplexo** e multiplica este número complexo com o encapsulado usando a fórmula:
    - `(a + bi) ∗ (c + di) = (ac − bd) + (ad + bc)i`

- **divide**: que recebe outra instância da classe **NumeroComplexo** e divide o número encapsulado pelo passado como argumento usando a fórmula:

    - ![function1](https://latex.codecogs.com/svg.image?\frac{a&plus;bi}{c&plus;di}=\frac{ac&plus;bd}{c^{2}&plus;d^{2}}&plus;\frac{bc-ad}{c^2&plus;d^2}i)

<!-- \frac{a+bi}{c+di}=\frac{ac+bd}{c^{2}+d^{2}}+\frac{bc-ad}{c^2+d^2}i -->

***

## Diagrama

![](diagrama.png)

***
## Esqueleto

<!--FILTER Solver.java java-->
```java
class Manual {
    public static void main(String[] args) {
        //case inicio
        Pet pet = new Pet(20, 10, 15);
        System.out.print(pet);
        //E:20/20, S:10/10, L:15/15, D:0, I:0
        pet = new Pet(10, 20, 50);
        System.out.print(pet);
        //E:10/10, S:20/20, L:50/50, D:0, I:0

        //case play - Brincar 
        pet = new Pet(20, 10, 15);
        pet.play();
        System.out.print(pet);
        //E:18/20, S:9/10, L:12/15, D:1, I:1
        pet.play();
        System.out.print(pet);
        //E:16/20, S:8/10, L:9/15, D:2, I:2

        //case comer 
        pet.eat();
        System.out.print(pet);
        //E:15/20, S:10/10, L:7/15, D:2, I:3

        //case dormir
        pet.sleep();
        System.out.print(pet);
        //E:20/20, S:9/10, L:7/15, D:2, I:8

        //case tomar banho
        pet.shower();
        System.out.print(pet);
        //E:17/20, S:8/10, L:15/15, D:2, I:10

        //case dormir sem sono
        pet.sleep();
        //fail: nao esta com sono

        //case morrer
        pet.play();
        pet.play();
        pet.play();
        pet.play();
        System.out.print(pet);
        //E:9/20, S:4/10, L:3/15, D:6, I:14
        pet.play();
        //fail: pet morreu de sujeira
        System.out.print(pet);
        //E:7/20, S:3/10, L:0/15, D:7, I:15
        pet.play();
        //fail: pet esta morto
        pet.eat();
        //fail: pet esta morto
        pet.shower();
        //fail: pet esta morto
        pet.sleep();
        //fail: pet esta morto

        //case exemplo2
        pet = new Pet(5, 10, 10);
        pet.play();
        pet.play();
        pet.play();
        //fail: pet morreu de fraqueza
        pet.play();
        //fail: pet esta morto
        System.out.print(pet);
        //E:0/5, S:7/10, L:1/10, D:3, I:3

        //case exemplo3
        pet = new Pet(10, 3, 10);
        pet.play();
        pet.play();
        pet.play();
        //fail: pet morreu de fome
        pet.play();
        //fail: pet esta morto
        System.out.print(pet);
        //E:4/10, S:0/3, L:1/10, D:3, I:3
    }
}
```
<!--FILTER_END-->