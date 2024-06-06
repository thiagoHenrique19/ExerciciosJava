package Vetores;

import java.util.Scanner;

public class ExemploGabriel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        String[] nome = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Me diga dez nomes: ");
            nome[i] = sc.nextLine();
        }
        System.out.println(nome[5]);


















    }
}
