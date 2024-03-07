package br.com.hello;

import java.util.Scanner;

public class ExemploConversor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua Idade");
        int idade = Integer.parseInt(leitor.nextLine());
        System.out.print("Sua idade daqui a 10 anos será: ");
        System.out.print(idade+ 10);
        System.out.println("");
        System.out.println("Digite a primeira nota:");
        double nota1 = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a segunda nota:");
        double nota2 = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a terceira nota:");
        double nota3 = Double.parseDouble(leitor.nextLine());
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é "+media);

        nota1 = 10;
        nota2 = 9.5;
        nota3 = 8.3;
        System.out.println(String.valueOf(nota1) +" + "+ String.valueOf(nota2) + " + " +String.valueOf(nota3) +" é igual a " + (nota1 + nota2 + nota3));
        System.out.println(""+nota1 +" + "+ nota2 + " + "  +nota3 +" é igual a " + (nota1 + nota2 + nota3));
        System.out.printf("%.1f + %.1f + %.1f é igual a %.1f",nota1,nota2,nota3,(nota1+nota2+nota3));

    }
}
