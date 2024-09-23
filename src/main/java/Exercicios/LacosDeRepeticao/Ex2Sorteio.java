package Exercicios.LacosDeRepeticao;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSorte = (int)(Math.random() * 1001);

        int tentativas = 0;
        Scanner sc = new Scanner(System.in);

                    System.out.println("Tente advinhar o numero ente 1 ate 1000");

        while (true){
                    System.out.println("Digite seu numero");
            int palpite = sc.nextInt();
                          tentativas++;

            if(palpite == numeroSorte) {
                    System.out.println("Voce acertou o numero, Parabens!");
                           break;
            }    else if(palpite < numeroSorte){
                    System.out.println("Seu palpite é menor que o numero escolhido");
            }    else {
                    System.out.println("Seu palpite é maior que o numero informado");
            }
        }
    }
}
