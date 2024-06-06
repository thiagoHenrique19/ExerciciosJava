package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf7B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //crie quatro variaveis para esse programa
        int numero1;
        int numero2;
        int numero3;
        int maiorNumero = 0;


        //solicite um numero ao usuario
        System.out.println("Me diga um numero ");
        numero1 = scanner.nextInt();
        //solicite mais um numero ao usuario
        System.out.println("Me diga mais um numero ");
        numero2 = scanner.nextInt();
        //solicite mais um numero ao usuario
        System.out.println("Me diga mais um numero ");
        numero3 = scanner.nextInt();
        //se o primeiro numero é maior que o segundo numero e o primeiro numero é maior que o terceiro numero qual é maior:
        if(numero1 > numero2 && numero1 > numero3){
            maiorNumero = numero1;
        }
        //se o segundo numero é maior que o primeiro numero e o segundo numero é maior que o terceiro numero qual é maior:
        if(numero2 > numero1 && numero2 > numero3){
            maiorNumero = numero2;
        }
        //se o terceiro numero é maior que o segundo numero e o terceiro numero é maior que o primeiro numero qual é maior:
        if(numero3 > numero2 && numero3 > numero1) {
            maiorNumero = numero3;
        }
        //agora ver qual sera o numero mais alto escrito pelo usuario
        System.out.println("O maior numero é o: " + maiorNumero);
        //mostrar para o usuario o maior numero apresentado
    }
}
