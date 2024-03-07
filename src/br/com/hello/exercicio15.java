package br.com.hello;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;
        double Perimetro = 2;

        System.out.println("Me informe o valor da base do retangulo: ");
        base = scanner.nextDouble();

        System.out.println("Me informe o valor da altura do retangulo: ");
        altura = scanner.nextDouble();

        double multiplicacao = base * altura * Perimetro;

        System.out.println("o valor da Area é: " + multiplicacao);



    }
}
