package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe um numero inteiro: ");
        int num = sc.nextInt();

        if (num <= 0){
            System.out.println("insira um numero positivo");
            return;
        }
        ArrayList<Integer> fatoresPrimosList = new ArrayList<>();
        int n = num;

        for (int i = 2; i <=  num; i++) {
            while (n % i == 0){
                fatoresPrimosList.add(i);
                n /= i;
            }
        }
        int[] fatoresprimos = new int[fatoresPrimosList.size()];

        for (int i = 0; i < fatoresPrimosList.size(); i++) {
            fatoresprimos[1] = fatoresPrimosList.get(i);
        }
        System.out.println("Numeros primos de " + num + ":");
        for(int fator : fatoresprimos){
            System.out.println(fator + " ");
        }
    }
}
