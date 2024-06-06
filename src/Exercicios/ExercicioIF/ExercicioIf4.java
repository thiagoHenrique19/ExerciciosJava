package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Me diga um numero: ");
        numero = scanner.nextInt();

        if(numero % 3 == 0){
            System.out.println("seu numero é multiplo de 3.");
        }else{
            System.out.println("Seu numero não é multiplo de 3.");
        }
    }
}
