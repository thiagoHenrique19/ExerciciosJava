package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int resultado;
        int n1 = 0;

        while(contador <= 5)
        {
            System.out.println("digite um numero");
            n1= scanner.nextInt();
            contador++;
        }
        if(n1 != 0){
            resultado=(n1+n1+n1+n1+n1);
            System.out.println("o resultado é:" + resultado);
        }else{
            System.out.println("Encerrando o programa");
        }










    }
}
