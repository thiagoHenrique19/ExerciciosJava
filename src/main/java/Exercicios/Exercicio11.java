package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("Me diga a base do retangulo: ");
        base = scanner.nextDouble();

        System.out.println("Me diga  a altura do retangulo: ");
        altura = scanner.nextDouble();

        double multiplicacao = base * altura;

        System.out.println(" o valor da area do retangulo é de: " + multiplicacao);



    }
}
