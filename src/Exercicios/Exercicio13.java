package br.com.hello;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Me diga o valor da primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Me informe o valor da segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Me diga o valor da terceira nota: ");
        nota3 = scanner.nextDouble();

        double multiplicação = nota1 * nota2 * nota3;

        System.out.println("O valor da media final: "+ multiplicação);

    }
}
