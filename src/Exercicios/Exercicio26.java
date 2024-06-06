package Exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio;
        double altura;

        System.out.println("Me diga qual é o raio do cilindro? ");
        raio = scanner.nextDouble();

        System.out.println("E a altura do cilindro? ");
        altura = scanner.nextDouble();

        double conta = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cilinro no total e´de: "+ conta);

    }
}
