package br.com.hello;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media;

        System.out.println("Me diga qual foi sua media? ");
        media = scanner.nextDouble();

        if (media <= 10 && media >= 7.0){
            System.out.println("Aprovado!");
        System.out.println("Parabens!");
    }
        if(media <= 7 && media >= 4.5 )
            System.out.println("Recuperacao");

        boolean criterioReprovacaoAtingido =
                media < 4.5 && media >=0;

        if(criterioReprovacaoAtingido){
            System.out.println("Reprovado");
        }

        }





    }

