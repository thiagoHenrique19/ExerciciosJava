package Exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        double inss = 11.0 /100.0;
        double salario;
        double SalarioInss;


        System.out.println("Qual é seu salario base? ");
        salario = scanner.nextDouble();

        SalarioInss = salario - (inss * salario) ;


        System.out.println("Seu salario com o desconto do INSS é de:" + SalarioInss);


    }
}
