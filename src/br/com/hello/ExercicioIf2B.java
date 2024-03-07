package br.com.hello;

import java.util.Scanner;

public class ExercicioIf2B {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
//definir variavel
        int numero;

//perguntar ao usuario um numero qualquer
        System.out.println("Me diga um numero.");
        numero = scanner.nextInt();
//ler o numero que foi mandado pelo usuario
//fazer o calculo
//numero apresentado pelo usuario comparado com dois igual a um
        if(numero % 2 ==1){
//caso o numero informado for impar deve informar que o valor é impar
            System.out.println("O numero informado é um numero impar.");
//caso o numero seja par deve informar para ele tentar novamente
        }else{
            System.out.println("O numero não corresponde, tente novamente.");
        }

        System.out.println("Obrigado");
    }
}


