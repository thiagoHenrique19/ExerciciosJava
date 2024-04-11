package br.com.hello;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double emprestimo;
        double jurosAnual;
        double mesesPagamentos;

        System.out.println("Qual o valor do emprestimo que foi pego? ");
        emprestimo = scanner.nextDouble();

        System.out.println("E como ficou a taxa de juros? ");
        jurosAnual = scanner.nextDouble();

        System.out.println("E quantos meses de pagamento? ");
        mesesPagamentos = scanner.nextDouble();

       double calculo = (emprestimo * jurosAnual / 12) / (1 - (1 + jurosAnual / 12) + Math.pow (mesesPagamentos,12));

        System.out.println("O valor que voce paga por mes é de: " + calculo );
    }
}
