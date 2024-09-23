package Exercicios;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Me diga um numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Me diga mais um numero");
        numero2 = scanner.nextDouble();

        System.out.println("A soma do numero " + numero1 + " + " + numero2 + " = " +(numero1 + numero2));

    }
}
