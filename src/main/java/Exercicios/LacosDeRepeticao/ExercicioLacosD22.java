package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosD22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float preco;
        float valorDivida;
        float juros = 0;
        float parcelas;

        System.out.println("Digite o preco do carro");
        preco = scanner.nextInt();
        System.out.println("quantidade de parcelas                     acrescimo de preços");
        System.out.println("        6                                      " + preco * 1.03);
        System.out.println("       12                                      " + preco * 1.06);
        System.out.println("       18                                      " + preco * 1.09);
        System.out.println("       24                                      " + preco * 1.12);
        System.out.println("       30                                      " + preco * 1.15);
        System.out.println("       36                                      " + preco * 1.18);
        System.out.println("       42                                      " + preco * 1.21);
        System.out.println("       48                                      " + preco * 1.24);
        System.out.println("       54                                      " + preco * 1.27);
        System.out.println("       60                                      " + preco * 1.30);




    }
}
