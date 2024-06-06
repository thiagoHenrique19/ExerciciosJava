package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutaçaoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedindo para o usuario numeros inteiros
        System.out.println("Me informe um numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Me informe mais um numero inteiro: ");
        int num2 = sc.nextInt();

        //utilizando if para ver se o numero digitado pelo usuario é positivo
        if (num1 < 0 || num2 < 0) {
            System.out.println("Insira somente numeros positivos");
            return;
        }
        //convertendo para uma String
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        //ver se os numeros tem o mesmo tamanho
        if (strNum1.length() != strNum2.length()) {
            System.out.println("Os numeros não são permutações ");
        } else {
            //converter as ArrayList em String
            ArrayList<Character> listNum1 = new ArrayList<>();
            ArrayList<Character> listNum2 = new ArrayList<>();
            for (char c : strNum1.toCharArray()) {
                listNum1.add(c);
            }
            for (char c : strNum2.toCharArray()) {
                listNum2.add(c);
            }
            //para ordenar as listas
            Collections.sort(listNum1);
            Collections.sort(listNum2);

            //verificar se as permutação são iguais
            if (listNum1.equals(listNum2)) {
                System.out.println("os numeros são permutação ");
            } else {
                System.out.println("Os numeros não são permutação ");
            }
        }
    }
}