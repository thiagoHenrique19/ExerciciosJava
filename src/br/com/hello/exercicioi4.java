package br.com.hello;

import java.util.Scanner;

public class exercicioi4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String name;
        System.out.println("Qual é seu nome ?");
        name = scanner.nextLine();
        System.out.println("Bem vindo " + name + "! Você esta no treinamento Segs");
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

    }
}
