package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//crie a variavel do numero
        int numero;

        //solicite um numero ao usuario
        System.out.println("Me diga um numero: ");
        numero = scanner.nextInt();
        //veja se o numero é multiplo de tres fazendo essa conta
        if(numero % 3 == 0){
            System.out.println("seu numero é multiplo de 3.");
        //numero informado pelo usuario faz a comparação com 3 igual a zero
        //caso o numero informado não seja multiplo de 3
        }else{
            System.out.println("Seu numero não é multiplo de 3.");
        }







        }
}
