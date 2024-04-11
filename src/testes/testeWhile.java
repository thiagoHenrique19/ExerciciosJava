package br.com.hello;

import java.util.Scanner;

public class testeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";

do {
    System.out.println("Voce precisa falar "
            + "as palavras mágicas...");
    System.out.println("Quer sair? ");
    texto = scanner.nextLine();
}while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("obrigado");

}

    }

