package br.com.hello;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital;
        double juros;
        double anos;

        System.out.println("Insira o valor principal? ");
        capital = scanner.nextDouble();

        System.out.println("E a taxa de juros? ");
        juros = scanner.nextDouble();

        System.out.println("Qual o numero de anos? ");
        anos = scanner.nextDouble();

        double jurosPor = juros/100;

        double montante = capital * Math.pow(1 + jurosPor, anos);
        System.out.println(montante);

        System.out.println("O valor futuro do investimento é: " );
    }
}
