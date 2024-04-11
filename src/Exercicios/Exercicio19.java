package br.com.hello;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco;
        double desconto;

        System.out.println("Qual o valor do produto? ");
        preco = scanner.nextDouble();

        System.out.println("Qual a porcentagem de desconto?");
        desconto = scanner.nextDouble();

        double contas = preco - (preco * (desconto/ 100));

        System.out.println("O valor final sera de: "+ contas);


    }
}
