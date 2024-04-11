package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVet2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new  Scanner(System.in);

        double soma = 0;
        double media;

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();

        double[] vetor = new double[n];



       for (int i=0; i<n; i++){
           System.out.print("Digite um numero: ");
           vetor[i] = scanner.nextInt();
       }

        for(int i=0; i<n; i++){
            soma = soma + vetor[i];
        }
        media = soma/n;

        System.out.print("Valores = ");

        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);


    }
}
