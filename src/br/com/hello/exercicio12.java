package br.com.hello;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double P=4;
        double lado;

        System.out.println("Qual o valor do lado de um quadrado? ");
        lado = scanner.nextDouble();

        double multiplicacao = P=4 * lado;

        System.out.println("O valor do perimetro do quadrado é de: " + multiplicacao);
    }
}
