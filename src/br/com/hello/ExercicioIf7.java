package br.com.hello;

import java.util.Scanner;

public class ExercicioIf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int maiorNumero = 0 ;

        System.out.println("Me diga um numero. ");
        numero1 = scanner.nextInt();

        System.out.println("Mais um numero. ");
        numero2 = scanner.nextInt();

        System.out.println("o ultimo numero. ");
        numero3 = scanner.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            maiorNumero = numero1;
        }
        if(numero2 > numero1 && numero2 > numero3){
            maiorNumero = numero2;
        }
        if(numero3 > numero2 && numero3 > numero1) {
            maiorNumero = numero3;
        }
        System.out.println("O maior numero é o: " + maiorNumero);
    }
}
