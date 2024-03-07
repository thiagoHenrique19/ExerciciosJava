package br.com.hello;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.println("Me diga um dos comprimentos do triangulo: ");
        lado1 = scanner.nextDouble();

        System.out.println("Diga mais um dos comprimentos: ");
        lado2 = scanner.nextDouble();

        System.out.println("Me enforme mais um comprimento: ");
        lado3 = scanner.nextDouble();

        double mais = lado1 + lado2 + lado3;

        System.out.println("O perimetro do triangulo é de: "+ mais);
    }
}
