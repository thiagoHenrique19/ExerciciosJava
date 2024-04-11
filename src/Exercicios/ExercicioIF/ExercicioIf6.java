package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int menorNumero = 0;

        System.out.println("Me informe um numero.");
        numero1 = scanner.nextInt();

        System.out.println("Me diga mais um numero. ");
        numero2 = scanner.nextInt();

        System.out.println("E o ultimo numero. ");
        numero3 = scanner.nextInt();

if (numero1 < numero2 && numero1 < numero3){
    menorNumero = numero1;
}


        if (numero2 < numero1 && numero2 < numero3){
            menorNumero = numero2;
        }


        if (numero3 < numero2 && numero3 < numero1){
            menorNumero = numero3;
        }


        System.out.println("O menor numero é o: " +  menorNumero);
    }
}
