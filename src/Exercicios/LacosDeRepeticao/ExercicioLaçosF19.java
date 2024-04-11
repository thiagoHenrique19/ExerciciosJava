package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLaçosF19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int quantidadeNumero = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um numero ");
            numero = scanner.nextInt();
        }
        if((numero >= 30)&&(numero <= 90)) {
            quantidadeNumero = quantidadeNumero +1;
        }
        System.out.println("A quantidade de numeros entre 30 e 90 é de: " + quantidadeNumero);
    }
}
