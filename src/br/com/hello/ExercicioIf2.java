package br.com.hello;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Me diga um numero.");
        numero = scanner.nextInt();

        if(numero % 2 ==1){
            System.out.println("O numero informado é um numero impar.");
        }else{
            System.out.println("O numero não corresponde, tente novamente.");
        }
        System.out.println("Obrigado");
    }
}
