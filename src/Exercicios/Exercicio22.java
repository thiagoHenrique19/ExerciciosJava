package br.com.hello;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minutos;
        double kilometros;

        System.out.println("Quanto tempo voce levou para concluir? ");
        minutos = scanner.nextDouble();

        System.out.println("E quantos kilometros deu? ");
        kilometros = scanner.nextDouble();

        double mais = minutos / kilometros;

        System.out.println("O tempo medio por kilometros é de: " + mais);





    }
}
