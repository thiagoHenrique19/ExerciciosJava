package br.com.hello;

import java.util.Scanner;

public class ExercicioIf6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int menorNumero = 0;



        //solicite um numero ao usuario
        System.out.println("Me informe um numero.");
        numero1 = scanner.nextInt();
        //solicite mais um numero ao usuario
        System.out.println("Me informe mais um numero. ");
        numero2 = scanner.nextInt();
        //solicite mais um numero ao usuario
        System.out.println("ME diga mais um numero. ");
        numero3 = scanner.nextInt();
        //se o primeiro numero é menor que o segundo numero e o primeiro numero é menor que o terceiro numero qual é menor :
        if (numero1 < numero2 && numero1 < numero3){
            menorNumero = numero1;
        }
        //se o segundo numero é menor que o primeiro numero e o segundo numero é menor que o terceiro numero qual é menor:
        if (numero2 < numero1 && numero2 < numero3){
            menorNumero = numero2;
        }
        //se o terceiro numero é menor que o segundo numero e o terceiro numero é menor que o primeiro numero qual é menor:
        if (numero3 < numero2 && numero3 < numero1){
            menorNumero = numero3;
        }

        //agora ver qual sera o numero mais baixo escrito pelo usuario
        System.out.println("O menor numero é o: " +  menorNumero);










    }
}
