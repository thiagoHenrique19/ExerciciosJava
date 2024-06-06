package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ProvaAbel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("qual a quantidade de notas que voce deseja para calcular a media? ");
        n = sc.nextInt();

        Double[] notas = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Qual é a nota: ");
            notas[i] = sc.nextDouble();
        }
        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma = soma + notas[i];
        }
        double media =   soma / n;
        System.out.println("A media é: " + media );
    }
}
