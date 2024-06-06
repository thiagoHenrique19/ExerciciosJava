package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int altura;
        int media = 0;
        int cont = 0;


        while (idade == 0)
           System.out.println("Digite sua idade: ");
      idade = scanner.nextInt();
       System.out.println("Digite sua altura: ");
        altura = scanner.nextInt();
        if (idade > 50) {
          media = media + altura;
        }
        cont++;
    media=media/cont;
        System.out.println("A media de altura das alturas é de: " + media);







    }
}
