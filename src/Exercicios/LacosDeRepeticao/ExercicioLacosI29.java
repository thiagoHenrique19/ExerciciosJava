package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("Digite a primeira nota");
        nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota");
        nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextInt();
        System.out.println("Digite a quantidade de falta deste aluno.");
        int faltas = scanner.nextInt();

        if(nota1 + nota2 + nota3 /3 > 6 && faltas <= 10);{
            System.out.println("Aluno aprovado");
      //  }else{
            System.out.println("Aluno reprovado");
        }
























    }
}
