package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf13B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double numero1;
        double numero2;


        //solicite ao usuario um numero
        System.out.println("Me informe um numero: ");
        numero1 = scanner.nextDouble();
        //solicite ao usuario mais um numero
        System.out.println("Me informe mais um numero: ");
        numero2 = scanner.nextDouble();
        //defina duas variaveis para os numeros indicados
        //faça a multiplicação dos dois numeros
        //defina uma variavel para este calculo
        double multiplicacao = numero1 + numero2;
        //agora veja se o resualtado é maior ou igual a 1000
        if(multiplicacao >= 1000){
            System.out.println("O valor final é maior que 1000");
        }else{
            System.out.println("O valor final é abaixo de 1000");
        }
        //caso seja maior apresente uma mensagem dizendo que é maior que 1000
        //caso seja menor apresente outra mensagem dizendo que é menor que 1000










    }
}
