package br.com.hello;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é seu nome? ");
        int idade = Integer.parseInt(leitor.nextLine());
        System.out.print("A sua idade daqui 10 anos sera: ");
        System.out.print(idade + 10);
    }
}
