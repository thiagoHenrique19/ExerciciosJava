package Exercicios.LacosDeRepeticao;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ExNumInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe um numero inteiro");
        int num1 = sc.nextInt();
        System.out.println("Me informe mais um numero inteiro");
        int num2 = sc.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Insira somente numeros positivos");
            return;
        }
        if (num1 == num2) {
            System.out.println("Os numeros sao permutação um do outro");
        } else {
            System.out.println("Os numeros não sao permutação");
        }

        //converter para uma string
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        //verificar para ver se os nuemros tem o mesmo valor
        if (strNum1.length() !=
                strNum2.length()) {
            System.out.println("Os numero não são permutação");
        } else{
            //converter as strings em array
            char[] arrNum1 = strNum1.toCharArray();
            char[] arrNum2 = strNum2.toCharArray();
            Arrays.sort(arrNum1);
            Arrays.sort(arrNum2);

            if (Arrays.equals(arrNum1, arrNum2)) {
                System.out.println("os numeros são permutação");
            } else {
                System.out.println("Os numeros não são permutações");

            }
        }
    }
}