package br.com.hello;

import java.util.Scanner;

public class ExercicioIf9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("qual é sua idade? ");
        idade = scanner.nextInt();

        if(idade >= 18 ){
            System.out.println("Voce ja pode fazer a CNH.");
        }else{
            System.out.println("Voce ainda nao pode fazer a CNH");
        };
    }
}
