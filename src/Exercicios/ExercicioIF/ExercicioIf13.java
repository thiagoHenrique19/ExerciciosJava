package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("me diga um numero. ");
        numero1 = scanner.nextDouble();

        System.out.println("Me diga mais um numero. ");
        numero2 = scanner.nextDouble();

        double multiplicação = numero1 + numero2;

        if(multiplicação >= 1000) {
            System.out.println("Seu numero é maior que 1000. ");
        }else{
            System.out.println("Seu numero é menor que 1000. ");
        }




    }



    }

