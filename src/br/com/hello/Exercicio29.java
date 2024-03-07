package br.com.hello;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ponto1;
        double ponto2;

        System.out.println("Me diga uma das coordenadas do ponto cartesiano: ");
        ponto1 = scanner.nextDouble();

        System.out.println("E qual a outra coordenada: ");
        ponto2 = scanner.nextDouble();

        double calculo = Math.sqrt((ponto2-ponto1) + Math.pow(ponto1,2) + (ponto1 - ponto2) + Math.pow(ponto2,2));

        System.out.println("A distancia entre eles é de: " + calculo);
    }
}
