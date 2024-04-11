package br.com.hello;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;

        System.out.println("Me diga um numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Me diga outro numero: ");
        numero2 = scanner.nextDouble();

        System.out.println("numero1 é maior ou igual ao número2 ? " + (numero1 >= numero2));
        System.out.println("numero1 é menor que número2 ? " + (numero1 < numero2));
        System.out.println("numero1 diferente do número2 ? " + (numero1 != numero2));
        System.out.println("numero1 é igual ao número2 ? " + (numero1 == numero2));
        System.out.println("numero1 é menor ou igual ao número1 ? " + (numero1 <= numero2));
        System.out.println("numero2 é maior ou igual ao número1 ? " + (numero2>=numero2));
        System.out.println("numero2 é menor que número1 ? " + (numero2<numero1));
        System.out.println("numero2 diferente do número1 ? " +(numero2!=numero1));
        System.out.println("numero2 é igual ao número1 ? " +  (numero2==numero1));
        System.out.println("numero2 é menor ou igual ao número1 ? " + (numero2<=numero1));

   }
}
