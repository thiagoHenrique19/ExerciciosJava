package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int sexo = 0;
        int soma = 0;
        int media = 0;
        int Quantidade = 0;
        int maior = 0;
        int menor = 0;
        int homeVelho = 0;
        int nome = 0;
        int qntdMulheres = 0;


        for (int i = 1; i < 7; i++) {
            System.out.println("Qual a sua idade: ");
            idade = scanner.nextInt();
            System.out.println("Qual é seu sexo  M(masculino) e F(feminino): ");
            sexo = scanner.nextInt();

            soma = soma + idade;
            media = soma / Quantidade;

            if (sexo == 'M' && idade > maior) {
                maior = idade;
                homeVelho = nome;
            }
            if (sexo == 'F' && idade < 20) {
                qntdMulheres += 1;
            }
            System.out.println("Media das idades é de: " + media);
            System.out.println("o mais velho é: " + homeVelho);

            if (qntdMulheres == 0) {
                System.out.println("Não temos mulheres no grupo ");
            } else {
                System.out.println("Mulheres com idade menor de 20 anos" + qntdMulheres);
            }


        }

    }


}