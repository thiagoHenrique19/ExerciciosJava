package Exercicios;

import java.util.Scanner;

public class exerciciow2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //Onde instancio o Scanner e dou um nome para ele
        System.out.println("Qual é seu nome"); //Aqui eu peço o nome
        String name = console.nextLine(); //Aqui eu tenho uma variavel de String(Que aceita qualquer caractere) o nome dela é name pois vai receber um nome
        System.out.println("Qual é sua idade"); //Aqui eu peço uma idade
        int idade = console.nextInt(); //Aqui eu tenho uma variavel int(Que so aceita numeros inteiros) o nome é idade pois vai receber uma idade
        System.out.println("Meu nome é"+ name ); // Aqui eu retorno meu nome e a variavel
        System.out.println("Minha idade é"+ idade );//Aqui eu retorno minha idade e a variavel

        String nome = "Thiago";
        int idade1 = 16;
        System.out.println("Meu nome é "+ nome  +
                "\nMinha idade é " + idade1);
    }
}
