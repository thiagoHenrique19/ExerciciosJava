package br.com.hello;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExercicioLacosI17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int somaidade = 0;
int pessoas90 = 0;
int p = 0;
int idade = 0;
int peso = 0;


        for (int i = p; i < 3; i++) {
    System.out.println("Digite a idade da pessoa: ");
    idade = scanner.nextInt();

    System.out.println("Digite a idade do peso: ");
    peso = scanner.nextInt();

    somaidade += idade;}
if(peso > 90){
    pessoas90 += 1;
            p += 1;

}
        System.out.println("Quantidade de pessoas com mais de 90kg " + pessoas90);
        System.out.println("Media de idade" + somaidade/3);














    }
}
