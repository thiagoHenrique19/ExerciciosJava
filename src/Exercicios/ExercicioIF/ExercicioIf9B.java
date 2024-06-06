package Exercicios.ExercicioIF;

import java.util.Scanner;

public class ExercicioIf9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//defina uma variavel com sua idade
        int idade;
        //pergunte ao usuario sua idade
        System.out.println("Qual é sua idade? ");
        idade = scanner.nextInt();
        //agora voce precisa saber se ele ja é maior de idade ou não para fazer a CNH
        //caso ele seja maior ou igual a 18 escreva a mensagem dizendo que ele ja pode fazer a CNH
        if(idade >= 18){
            System.out.println("Voce ja pode fazer CNH. ");
        }else{
            System.out.println("Voce não pode fazer CNH. ");
        }
        //caso ele seja menor ou igual a 17 escreva a mensagem dizendo que ele não pode fazer a CNH
        //agora aprensente para o usuario sua idade e se ja pode fazer a CNH








    }
}
