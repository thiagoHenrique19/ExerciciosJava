package br.com.hello;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base1;
        double base2;
        double altura;

        System.out.println("Qual a medida da primeira base? ");
        base1 = scanner.nextDouble();

        System.out.println("E da segunda base? ");
        base2 = scanner.nextDouble();

        System.out.println("E a altura do trapezio? ");
        altura = scanner.nextDouble();

        double calculo = (base1 + base2) + altura / 2;

        System.out.println("A area do trapezio é de: " + calculo);
    }
}
