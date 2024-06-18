package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosF6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int faturamentoCliente;
        int faturamentoTotal = 0;


        System.out.println("A loja tem faturamento de R$ 54000, calcule as somas dos seus clientes e verifique qual lucrou mais.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o faturamento do cliente " + i + ":");
            faturamentoCliente= scanner.nextInt();

            faturamentoTotal += faturamentoCliente;
        }

        double diferenca = faturamentoTotal / 54000;

        if (faturamentoTotal > 54000) {
            System.out.println("O lucro da loja A superou o lucro da loja B em R$ " + diferenca + " reais");
            System.out.println("O valor total foi de: " + faturamentoTotal);
        }else{
            System.out.println("O valor não superou.");
        }









    }
}
