package ExercicioIF;

import java.util.Scanner;

public class ExericicioIf8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("Qual a primeira nota? ");
        nota1 = scanner.nextInt();

        System.out.println("Qual a segunda nota? ");
        nota2 = scanner.nextInt();

        System.out.println("Qual a terceira nota? ");
        nota3 = scanner.nextInt();

        int calculo1 = nota1 + nota2 + nota3;

        int media = calculo1 / 3;

        System.out.println("A sua media é de: " + media);

        if( media >= 9){
            System.out.println("Exercelente ");
        }
        if(media >= 7){
            System.out.println("Muito bom ");
        }
        if(media >= 6){
            System.out.println("Bom ");
        }
        if (media >= 5) {
            System.out.println("Regular ");
        }
        if(media >= 4){
            System.out.println("Insuficiente ");

        }
    }
}
