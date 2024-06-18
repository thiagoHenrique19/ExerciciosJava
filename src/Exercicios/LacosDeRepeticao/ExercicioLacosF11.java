package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosF11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero.");
        numero = scanner.nextInt();

        for (int i = 1; i < numero; i++) {

        }
        if(numero % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }







    }
}
