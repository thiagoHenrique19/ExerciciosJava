package br.com.hello;

import java.util.Scanner;

public class EXERCICOU5 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite seu nome");
        String name = console.nextLine();
        System.out.println("O nome informado foi "+ name);
        System.out.println("Seu nome tem "+name.length()+" letras");
        
    }
}
