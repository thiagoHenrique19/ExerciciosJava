package testes;

import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String[] args) {
        //instanciar um scanner para ler os dados
        Scanner leitor = new Scanner(System.in);
        //pedir para o usuário informar a idade
        System.out.println("Informe a sua idade");
        //armazenar a informação da idade que o usuário vai informar
        int idade = Integer.parseInt(leitor.nextLine());
        //se a idade for maior ou igual a 18 apresentar uma mensagem voce é de maior
        if(idade >= 18){
            System.out.println("você é maior de idade");
        } //senão apresentar a mensagem você é de menor
        else{
            System.out.println("você é menor de idade");
        }
    }
}
