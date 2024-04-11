package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Me informe um numero qualquer: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O valor informado é par.");
        } else {
            System.out.println("O valor informado é impar.");
        }

        System.out.println("continuando o programa");

    }
}