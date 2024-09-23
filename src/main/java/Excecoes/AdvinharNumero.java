package Excecoes;

import java.util.Random;
import java.util.Scanner;

public class AdvinharNumero{
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSorte = random.nextInt(1001);

        int tentativas = 0;
        Scanner sc = new Scanner(System.in);

                       System.out.println("Tente advinhar o numero entre 1 a 1001");

        while (true){
            try {
                       System.out.println("Digite seu numero");
                int palpite = sc.nextInt();
                tentativas++;
                if (palpite == numeroSorte){
                       System.out.println("voce acertou o numero!PARABENS!!!!!!");
                       break;
                } else if (palpite < numeroSorte) {
                       throw new MenorQueException("Seu palpite é menor que o numero escolhido");
                }else{
                       throw new MaiorQueException("seu numero é maior que o numero escolhido");
                }
            }catch (MenorQueException e){
                       System.out.println(e.getMessage());
            }catch (MaiorQueException e){
                       System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
