package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio;


        System.out.println("Qual o raio de um circulo?  " );
        raio = scanner.nextDouble();

        double circunferencia = 2 * 3.14 * raio;

        double area = 3.14 * Math.pow(raio, 2);

        System.out.println("O valor da circunferencia e da area é de: " + circunferencia  +  area);







    }
}
