package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //crie tres variaveis
        //a primeira variavel voce cria usando o valor nota1
        double nota1;
        //a segunda variavel voce cria usando a nota2
        double nota2;
        //a terceira variavel voce cria usando a nota3
        double nota3;

 //solicite um numero ao usuario
        System.out.println("Me informe a primeira nota. ");
        nota1 = scanner.nextInt();
        //leia esse numero
 //solicite mais um numero
        System.out.println("E agora a segunda nota. ");
        nota2 = scanner.nextInt();
        //leia esse numero
 //solicite o ultimo numero
        System.out.println("E a  terceira nota. ");
        nota3 = scanner.nextInt();
       //leia esse codigo
   //crie mais uma variavel para somar as tres notas
        double calculo1 = nota1 + nota2 + nota3;
   //crie mais uma variavel para fazer a soma das tres notas dividido por tres
        double calculo2 = calculo1 / 3 ;
        //isso resultara em sua media final
   //caso essa nota seja maior de 6 voce estara aprovado
        //mas se a nota estiver menor de 6 voce esta reprovado
        if(calculo2 > 6){
            System.out.println("Aprovado. ");
        }else{
            System.out.println("Reprovado. ");
        }

   //e no final escreva qual é sua media final
            System.out.println("Sua media final é de:" + calculo2 );








    }

    }