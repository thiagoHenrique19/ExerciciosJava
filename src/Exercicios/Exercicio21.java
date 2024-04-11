package br.com.hello;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBruto;
        double descontoIR;

        System.out.println("Qual é o salario bruto de uns dos funcionarios? ");
        salarioBruto = scanner.nextDouble();

        System.out.println("E a porcentagem de desconto do imposto de renda? ");
        descontoIR = scanner.nextDouble();

        double mais = salarioBruto - (salarioBruto * (descontoIR / 100));

        System.out.println("O salario final do funcionario é de: "+ mais);
    }
}
