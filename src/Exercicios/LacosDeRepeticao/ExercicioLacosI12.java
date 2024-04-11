package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe um numero entre 1 e 20: ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= 20) {
            System.out.println("Tenho que imprimir o quadrado ");
            for (int linha = 1; linha <= numero; linha++) {
                for (int coluna = 1; coluna <= numero; coluna++) {
                    if (linha == 1 || coluna == 1) {
                        System.out.print("*");
                    } else if (coluna == numero || linha == numero) {
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                    }
                }

                        System.out.println();



                }
            }
        }
    }
