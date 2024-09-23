package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdade = 0;
        int cont = 0;


        do {
            System.out.println("Digite uma idade ");
            idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }
            somaIdade += idade;
            cont++;
        } while (idade != 0);

        int media = somaIdade / cont;
        System.out.println("A media de idades e´de: " + media);
    }








    }

