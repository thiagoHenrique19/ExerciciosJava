package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = 0;
        int somaIdadeOtimo = 0;
        int QuantidadeRegular = 0;
        int QuantidadeBom = 0;

        for (int i = 1; i < 3; i++) {
            System.out.println("digite sua idade.");
            int idade = scanner.nextInt();
            System.out.println("Digite sua opiniao sobre o filme: 1 regular| 2 bom | 3 otimo");
            int opiniao = scanner.nextInt();

            if (opiniao == 3) {
                somaIdadeOtimo += idade;
            }
            if (opiniao == 1) {
                QuantidadeRegular += 1;
            }
            if (opiniao == 2) {
                QuantidadeBom += 1;
            }
               p += 1;

        }

        System.out.println("Media das idades das pessoas que responderam otimo: " + somaIdadeOtimo/3);
        System.out.println("quantidade de pessoas que responderam regular: " + QuantidadeRegular);
        System.out.println("Quantidade de pessoas que responderam bom: " + QuantidadeBom/3);

    }
}
