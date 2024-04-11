package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosD30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int main;
        int matricula;
        float nota = 0;
        int frequencia = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Digite a matricula");
            matricula = scanner.nextInt();
            System.out.println("Digite as tres notas");
            nota = scanner.nextFloat();
            nota = (n1 + n2 + n3) / 3;
            System.out.println("digite a frequencia");
            frequencia = scanner.nextInt();
        }
        if (nota >= 6) {
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }
        if(frequencia <= 40){
            System.out.println("Reprovado por falta");
        }else{
            System.out.println("sua frequencia esta boa");
        }









    }
}
