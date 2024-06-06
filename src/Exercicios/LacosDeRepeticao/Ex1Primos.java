package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class Ex1Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;
        int x = 1;

        System.out.println("Me informe um numero");
        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i++) {
           boolean primo = true;

            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println("Esse valor é um numero primo: " + i);
            }else{
                System.out.println("Esse valor não é um numero primo");
            }
        }
    }
}
