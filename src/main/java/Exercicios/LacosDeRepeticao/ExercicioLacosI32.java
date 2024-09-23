package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int status = 0;
        int numCanal = 0;
        int numPessoas = 0;
        int canal4 = 0;
        int canal5 = 0;
        int canal7 = 0;
        int canal12 = 0;
        int totalPessoas = 0;
        int tv;

        System.out.println("Informe se a tv esta ligada. ");
        tv = scanner.nextInt();
        if(status == 0) {
            System.out.println("Ligada");
            System.out.println("Digite o canal que esta send assistido:(4, 5, 7, ou 12) ou 0: ");
            numCanal = scanner.nextInt();
            System.out.println("Digite o numero de pessoas que estavam vendo este canal: ");
            numPessoas = scanner.nextInt();
            while (numCanal != 0) {
            canal4 = canal4 + numPessoas;
        }if( numCanal == 5 ){
                canal5 = canal5 + numPessoas;
            }if (numCanal == 7) {
                canal7 = canal7 +numPessoas;
            }if (numCanal == 12) {
                canal12 = canal12 + numPessoas;
            }else{
                System.out.println("Numero do canal digitado não é valido");
                tv = scanner.nextInt();

                totalPessoas = totalPessoas + numPessoas;
                System.out.println("digite o canal (4,5,7 ou 12) ou 0: ");
                numCanal = scanner.nextInt();
         //  }else{
                System.out.println("desligada");
                System.out.println("tv esta desligada,proxima casa: ");
          //  }else {
                System.out.println("Opção informada não é valida");
                System.out.println("Informe se a TV da casa esta desligada ou ligada: ");
            }



        }

        System.out.println("audiencia do canal 4 é:" + canal4);
        System.out.println("audiencia do canal 5 é:" + canal5);
        System.out.println("audiencia do canal 7 é:" + canal7);
        System.out.println("audiencia do canal 12 é:" + canal12);

    }
}
