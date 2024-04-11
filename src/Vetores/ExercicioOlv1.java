package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOlv1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String n;

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Diga seu nome: ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("\nNomes cadastrados: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}