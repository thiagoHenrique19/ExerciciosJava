package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLaçosF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiplicacao = i * j;
                System.out.println(j + " x " + i + " = " + multiplicacao);
            }
            System.out.println();
        }


    }

}


