package testes;

import java.util.Scanner;

public class ReaderApp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = console.nextLine();
        System.out.println("O nome informado foi "+ name);
        System.out.println("Seu nome tem "+name.length()+" letras");

        console.close();
    }
}
