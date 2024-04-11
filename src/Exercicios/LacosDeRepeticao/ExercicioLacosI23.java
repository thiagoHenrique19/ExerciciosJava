package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;


        for (int i = 1; i < 5; i++) {
            System.out.println("Digite uma idade. ");
            int idade = scanner.nextInt();

            soma += idade;
            quantidade += 1;
        }
        System.out.println("A media de idade é de: " + soma/quantidade + " anos.");








    }
}
