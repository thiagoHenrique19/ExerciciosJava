package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Me informe um numero: ");
        numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("O valor informado é um numero par");
        }else{
            System.out.println("O valor informado não corresponde, tente novamnete.");
        }
        System.out.println("Continuando o programa.");
    }
}
