package Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int numero1;
        int numero2;

        System.out.println("Diga o primeio numero inteiro: ");
        numero1 = sc.nextInt();

        if(numero1 <= 0 ){
            System.out.println("O numero é invalido, coloque um numero positivo");
        }
        System.out.println("Agora me informe o segundo numero inteiro: ");
        numero2 = sc.nextInt();

        if(numero2 <= 0){
            System.out.println("o numero é invalido, por favor informe um numero positivo:  ");
        }
        String strnumero1 = String.valueOf(numero1);
        String stringumero2 = String.valueOf(numero2);

        if(strnumero1.length() != strnumero1.length()){
            System.out.println("os numeros não tem o mesmo numero de digitos,Portanto não é possivel fazer");
        }
    }
}
