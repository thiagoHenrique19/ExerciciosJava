package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int receber;

        System.out.println("Me diga um numero. ");
        receber = scanner.nextInt();

        if( receber >= 0){
            System.out.println("seu numero é positivo. ");
             }else{
                System.out.println("Seu numero é negativo. ");
            }

    }
}
