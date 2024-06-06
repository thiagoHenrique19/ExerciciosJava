package ExerciciosString;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ExNumeInteros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe um numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Me informe outro numero inteiro: ");
        int num2 = sc.nextInt();

        if (num1 < 0 ||num2 < 0){
            System.out.println("insira somente numeros positivios");
        }else{
            System.out.println("Isso, voce informou um numero positivo");
        }
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        if (strNum1.length() !=
                 strNum2.length()){
            System.out.println("Os numero não são permutação");
        }else{
            char[] arrNum1 = strNum1.toCharArray();
            char[] arrNum2 = strNum2.toCharArray();
            Arrays.sort(arrNum1);
            Arrays.sort(arrNum2);

            if(Arrays.equals(arrNum1, arrNum2)){
                System.out.println("Os numeros são permutação");
            }else{
                System.out.println("os numeros não são permutação");
            }
        }
    }
}
