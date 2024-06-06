package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVet1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Numeros negativos: ");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }
    }
}
