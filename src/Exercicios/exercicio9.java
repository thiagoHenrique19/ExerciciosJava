package Exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//
        
        double numero1;//definir a variavel

        System.out.println("Me diga um numero: ");
         numero1 = scanner.nextDouble();//vai esperar ate eu digitar um numero

         double multiplicacao = numero1 * 3;//onda faz a multiplicação
        System.out.println(numero1 + " x 3 é: " + multiplicacao);


    }
}
