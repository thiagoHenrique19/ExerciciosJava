package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aVista = 0;
        int aPrazo = 0;
        int total = 0;
        int compraPrazo = 0;
        int compraVista = 0;

        for (int i = 1; i < 2; i++) {
            int tipoDeCompra = 0;
            int compraVista1 = compraVista;
            int valorDaCompra = 0;
            System.out.println("Digite o valor da compra");
            valorDaCompra = scanner.nextInt();
            if (compraPrazo == tipoDeCompra) {
                aPrazo += valorDaCompra;
            } else {
                aVista += valorDaCompra * 1.10;

                total += valorDaCompra;
            }

        }

        System.out.println("A vista: " + aVista);
        System.out.println("A prazo: " + aPrazo);
        System.out.println("total: " + total);
    }


}
