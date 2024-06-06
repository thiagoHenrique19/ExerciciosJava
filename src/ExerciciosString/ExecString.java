package ExerciciosString;

import org.w3c.dom.Text;

import java.util.Scanner;

public class ExecString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("String não envolve numeros!");
        System.out.println("Digite uma string: ");
        String entrada = sc.nextLine();

        String stringinvertida = new StringBuilder(entrada).reverse().toString();

        System.out.println("Assim é a string invertida: " + stringinvertida);
    }
}