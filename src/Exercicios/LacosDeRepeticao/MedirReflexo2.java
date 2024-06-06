package Exercicios.LacosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class MedirReflexo2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int tempoAleatorio = 10 +
                random.nextInt(4000);

        int numeroAleatorio = 1 +
                random.nextInt(100);

        try{
            System.out.println("Voce deve ficar atento pois ira aparecer um numero aleatorio e você deve ser o mais rapido possivel");
            Thread.sleep(tempoAleatorio);
        }catch (InterruptedException e){

          e.printStackTrace();
        }
        System.out.println("Agora digite o numero:  " + numeroAleatorio);

        long tempoInicial =
                   System.currentTimeMillis();

        int entradaUsuario =
                sc.nextInt();

        long tempoFinal =
                System.currentTimeMillis();

        if(entradaUsuario == numeroAleatorio){
            long temporeacao = tempoFinal - tempoInicial;
            System.out.println("Seu tempo de reação foi: " + temporeacao + " Milissegundos");
        }else{
            System.out.println("seu numero esta incorreto! tente novamente");
        }
    }
}
