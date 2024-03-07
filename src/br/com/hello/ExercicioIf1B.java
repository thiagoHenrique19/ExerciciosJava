package br.com.hello;

import java.util.Scanner;

public class ExercicioIf1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//definir variavel
        int numero;




        //solicitar ao usuario um numero
        System.out.println("Me informe um numero: ");
        numero = scanner.nextInt();
        //ler o numero apresentado pelo usuario
        //fazer o calculo
        //o valor informado pelo usuario comparado por 2 que é o valor do par igual a zero
        if(numero % 2 == 0){
        //caso o valor informado for par poste uma mensagem dizendo que é um numero par
            System.out.println("O valor informado é um numero par");
        //caso não for peça para tentar novamnete
        }else{
            System.out.println("O valor informado não corresponde, tente novamnete.");
        }
        System.out.println("Continuando o programa.");















    }
}
