package Array;

import java.util.Scanner;

public class Ex3ArrayControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da array: ");
        int tamanhoArray = sc.nextInt();

        Ex3Array arrayObj = new Ex3Array(tamanhoArray);

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o " + (i + i) + "Numero");
            int numero = sc.nextInt();
            arrayObj.adicionar(numero);
        }
      //  System.out.println("Media dos Arrays" + arrayObj.calculamedia());
    }
}
