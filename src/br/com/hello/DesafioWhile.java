package br.com.hello;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNotas = 0;
        double nota= 0;
        double total = 0;

        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = scanner.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeNotas++;
            }else{
                System.out.println("Nota invalida!!!! ;D");
            }
        }

            //calcular media
            double media = total / quantidadeNotas;
            System.out.println("Media = " + media);
        }



    }

