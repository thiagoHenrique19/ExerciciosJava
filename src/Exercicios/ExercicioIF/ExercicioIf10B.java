package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf10B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //defina uma variavel com a idade dita
        int idade;
        //pergunte ao usuario sua idade
        System.out.println("Qual é sua idade? ");
        idade = scanner.nextInt();
        //e agora voce precia ver se ele ja pode fazer o titulo de eleitor
        //caso ele seja maior ou igual a 18 anos ele é obrigado a fazer
        if(idade >= 18){
            System.out.println("Voce é obrigado a fazer o titulo de eleitor.");
        }
        //se ele é maior ou igual a 16 ele não precisa necessariamente fazer;
        if(idade >= 16){
            System.out.println("Voce pode fazer o titulo mas não é obrigado.");
        }
        //se ele é menor ou igual a 15 anos ele nao pode fazer
        if(idade <= 15){
            System.out.println("Voce não pode fazer o titulo de eleitor. ");
        }
        //apresente a mensagem junto com a idade que foi dita









    }
}
