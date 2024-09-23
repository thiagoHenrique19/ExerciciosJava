package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf3B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;


   //perguntar ao usuario um numero qualquer
        System.out.println("Me informe um numero qualquer: ");
        numero = scanner.nextInt();
        //ler o numero informado
   //  usar o metodo do verdadeiro ou falo, caso o numero seja par vai ocasionar como verdadeiro e se for impar vai ocasionar como falso
        if (numero % 2 == 0) {
            System.out.println("O valor informado é par.");
        } else {
            System.out.println("O valor informado é impar.");
        }

        System.out.println("continuando o programa");









    }
}
