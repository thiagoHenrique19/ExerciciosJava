package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("qual foi sua primeira nota?");
        nota1 = sc.nextInt();

        System.out.println("qual foi sua segunda nota?");
        nota2 = sc.nextInt();

        System.out.println("Qual foi sua terceira nota?");
        nota3 = sc.nextInt();

        if (nota1 <= 6){

            System.out.println("sua primeira nota esta em cima da media: " + nota1);
        }else{

            System.out.println("sua primeira nota não esta a cima da media: " + nota1);
        }
        if (nota2 <= 6){

            System.out.println("sua segunda nota esta acima da media: " + nota2);
        }else{

            System.out.println("sua segunda nota não esta acima da media: " + nota2);
        }
        if (nota3 <= 6){

            System.out.println("sua terceira nota esta acima da media: " + nota3);
        }else{

            System.out.println("sua terceira nota esta abaixo da media: " + nota3);
        }
        int calculo = nota1 + nota2 + nota3;

        System.out.println("sua media final é de:" + calculo);
    }
}
