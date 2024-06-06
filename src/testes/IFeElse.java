package testes;

import java.util.Scanner;

public class IFeElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Quantos anos voce tem? ");
        idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Voce é maior de idade. ");
        } else{
            System.out.println("Voce é menor de idade. ");
        }

    }
}
