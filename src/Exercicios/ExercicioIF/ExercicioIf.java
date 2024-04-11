package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Quantos anos voce tem? ");
        idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }

        System.out.println("continuando o programa");


    }
}
