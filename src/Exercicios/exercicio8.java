package br.com.hello;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Me diga um numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Me diga mais um numero: ");
        numero2 = scanner.nextDouble();

        double multiplicacao = numero1 * numero2;

        System.out.println(numero1 + " x " + numero2 + " é de " + multiplicacao);


    }
}
