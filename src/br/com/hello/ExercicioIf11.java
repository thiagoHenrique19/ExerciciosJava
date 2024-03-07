package br.com.hello;

import java.util.Scanner;

public class ExercicioIf11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Qual é seu nome? ");
        nome = scanner.next();

        if(nome.length() % 2 == 0){
            System.out.println("a quantidade de letras que tem torna seu nome um numero par. ");
        }else{
            System.out.println("a quantidade de letras que tem torna seu nome um numero impar. ");
        }
    }
}
