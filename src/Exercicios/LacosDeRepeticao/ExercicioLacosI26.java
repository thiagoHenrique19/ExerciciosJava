package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double somaPeso1 = 0;
        double somaPeso2 = 0;
        double somaPeso3 = 0;
        int idade;
        int peso;

        for (int i = 1; i < 15; i++) {
            System.out.println("Digite a idade.");
            idade = scanner.nextInt();
            System.out.println("Digite o peso.");
            peso = scanner.nextInt();

            if (idade > 1 && idade < 10) {
                somaPeso1 += peso;
            }
            if (idade > 10 && idade < 20) {
                somaPeso2 += peso;
            }
            if (idade > 20 && idade < 30) {
                somaPeso3 += peso;
            }
            System.out.println("Faixa etaria 1 ( 1 ate 10) :" + somaPeso1 / 3);
            System.out.println("Faixa etaria 1 (10 ate 20) :" + somaPeso2 / 3);
            System.out.println("Faixa etaria 1 (20 ate 30) :" + somaPeso3 / 3);


        }


















    }
}
