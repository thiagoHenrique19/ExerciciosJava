package Exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Me diga um numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Me diga mais um numero: ");
        numero2 = scanner.nextDouble();

        double subtracao = numero2 - numero1;

        System.out.println("A subtração do " + numero2 + " Com " + numero1 + " é igual a " + subtracao);

    }
}
