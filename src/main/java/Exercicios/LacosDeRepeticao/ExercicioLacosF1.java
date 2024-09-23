package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosF1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;


        System.out.println("Me informe um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
            }
        }
    }

