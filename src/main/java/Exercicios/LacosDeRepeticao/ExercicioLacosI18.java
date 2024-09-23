package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade;
        double peso;
        double altura;
        char corOlhos;
        char corCabelos;
        int i;
        int conIdadePeso = 0;
        int contIdade = 0;

        for (int j = 1; j < 20; j++) {
            System.out.println("Qual a idade: ");
            idade = scanner.nextDouble();
            System.out.println("Qual o peso: ");
            peso = scanner.nextDouble();
            System.out.println("Qual a altura: ");
            altura = scanner.nextDouble();
            System.out.println("Me diga a cor dos olhos A(azul) P(preto) C(castanho)");
            corOlhos = scanner.next().charAt(0);
            System.out.println("Me informe a cor do cabelo L(loiro) P(preto) C(castanho)");
            corCabelos = scanner.next().charAt(0);
            scanner.nextLine();

            if(idade > 50 && peso < 60){
                conIdadePeso++;
                System.out.println("A quantidade de pessoas com idade superior a 50 e com o peso inferior a 60 e: " + conIdadePeso);
            }
            if(altura < 1.50){
                idade++;
            }





        }












    }
}
