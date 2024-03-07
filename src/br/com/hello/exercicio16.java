package br.com.hello;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso;
        double altura;

        System.out.println("Quantos kg voce tem? ");
        peso = scanner.nextDouble();

        System.out.println("Quantos metros voce tem? ");
        altura = scanner.nextDouble();

        double multiplicacao = peso / (altura * altura);

        System.out.println("O valor do IMC: " + multiplicacao);

    }
}
