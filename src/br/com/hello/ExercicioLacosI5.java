package br.com.hello;

import java.util.Scanner;

public class ExercicioLacosI5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maior = 0;
        double meio = 0;
        double menor = 0;


        System.out.println("digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = scanner.nextInt();

        if(a > b && a > c){
            maior = a;
        }if(b > a && b > c){
            maior = b;
        }if(c > a && c > b ){
            maior = c;
        }

        if(a < b && a < c){
            menor = a;
        }if(b < a && b < c ){
            menor = b;
        }if(c < a && c < b ){
            menor = c;
        }

        if(a != menor && b != maior){
            meio = c;
        }if(a != menor && c != maior){
            meio = c;
        }else{
            meio =a;
        }

        System.out.println(" maior: " + maior + " meio: " + meio + " menor: " + menor);

        System.out.println(" menor " + menor + " meio " + meio + " maior " + maior );






    }
}
