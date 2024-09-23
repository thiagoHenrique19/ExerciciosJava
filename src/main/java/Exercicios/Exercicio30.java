package Exercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double receberMinutos;
        double dias;
        double horas;

        System.out.println("Me diga um numero total de minutos: ");
        receberMinutos = scanner.nextDouble();

        dias = receberMinutos / 1440;

        horas = receberMinutos / 60;

        System.out.println("O valor recebido em dia é: " + dias + "\nO valor recebido em horas é " + horas + "\nO valor recebido em minutos é: " + receberMinutos);


    }
}
