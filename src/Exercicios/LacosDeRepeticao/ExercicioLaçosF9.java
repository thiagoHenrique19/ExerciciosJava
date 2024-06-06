package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLaçosF9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade = 0;
        double cont = 0;
        double maior18 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Qual é sua idade? ");
            idade = scanner.nextDouble();

            if (idade >= 18) {
                cont++;
            }
        }
                System.out.println("A quantidade de pessoa com a idade maior ou igual 18 anos é de: " + cont);
        }
    }





