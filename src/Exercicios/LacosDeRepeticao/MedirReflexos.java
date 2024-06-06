package Exercicios.LacosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class MedirReflexos {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //gera tempo aleatorio
        int tempoAleatorio = 10 +
                random. nextInt(4000);
        // gera numero aleatorio
        int numeroAleatorio = 1 +
                random.nextInt(100);

        try {
            //pausa por um tempo aleatorio
            System.out.println("Fique atento que vai aparecer um numero e voce tera que ser o mais rapido possivel");
            Thread.sleep(tempoAleatorio);
        }catch (InterruptedException e){

            e.printStackTrace();
        }
        System.out.println("Agora digite o numero: " + numeroAleatorio);

        //tempo inicial
        long tempoInicial =
                System.currentTimeMillis();

        //esepera a entrada do usuario
        int entradaUsuario =
                sc.nextInt();

        //pega o tempo final
        long tempoFinal =
                System.currentTimeMillis();

        //vai ver se o numero digitado vai estar correto
        if (entradaUsuario == numeroAleatorio){
            //calcula a reação do usuario
            long tempoReacao = tempoFinal - tempoInicial;
            System.out.println("Seu tempo de reação foi: " + tempoReacao + " Milissegundos");
            //caso o numero nao esteja correto
        }else{
            System.out.println("Seu numero esta incorreto! tente novamente");
        }
    }
}
