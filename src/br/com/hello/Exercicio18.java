package br.com.hello;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("Me diga um numero qualquer: ");
        n1 = scanner.nextDouble();

        System.out.println("Me informe mais um numero: ");
        n2 = scanner.nextDouble();

        System.out.println("Mais um numero por favor: ");
        n3 = scanner.nextDouble();

        double mais = (n1 + n2 + n3)/3;

        System.out.println("A media aritmética é de: "+ mais);




    }
}
