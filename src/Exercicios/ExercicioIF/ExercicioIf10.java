package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;


        System.out.println("Qual a sua idade? ");
        idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Voce é obrigado a fazer o titulo de eleitor ");
        }
        if(idade >= 16){
            System.out.println("Voce pode fazer o titulo de eleitor, mas não é obrigado ");
        }
        if(idade <= 15){
            System.out.println("Voce nao pode fazer o titulo de eleitor ");
        }
    }
}
