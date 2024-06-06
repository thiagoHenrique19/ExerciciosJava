package Exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cateto1;
        double cateto2;

        System.out.println("Me diga qual é o cateto do triangulo retangulo: ");
        cateto1 = scanner.nextDouble();

        System.out.println("Me informe mais um cateto: ");
        cateto2 = scanner.nextDouble();

        double soma = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        double hipotenusa = Math.sqrt(soma);

        System.out.println("Resultado do calculo: " + hipotenusa);
    }
}
