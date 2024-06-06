package Array;

import java.util.Scanner;

public class ExAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o primeiro numero inteiro: ");
        int numero1 = sc.nextInt();

        if (numero1 <= 0){
            System.out.println("o numero é invalido, informe um numero positivo");
        }
        System.out.println("Agora me informe o segundo numero inteiro: ");
        int numero2 = sc.nextInt();

        if (numero2 <= 0){
            System.out.println("o numero é invalido informe um numero positivo");
        }
        String strnumero1 = String.valueOf(numero1);
        String strnumero2 = String.valueOf(numero2);

        if (strnumero1.length() != strnumero2.length()){
            System.out.println("Os numeros não tem o mesmo numero de digitos, por conta disso não é possivel fazer");
        }else{
            System.out.println("Os numeros contem o mesmo numero de digitos");
        }
    }
}
