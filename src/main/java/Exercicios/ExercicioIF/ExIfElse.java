package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        System.out.println("Qual a sua idade?");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Voce é maior de idade");
        }else{
            System.out.println("voce é menor de idade");
        }
    }
}
