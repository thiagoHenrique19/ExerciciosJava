package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosI10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;


        for (int i = 1; i < 4; i++) {
            System.out.println("digite a idade da pessoa.");
            int idade = scanner.nextInt();
            if (idade <= 15){
                faixa1 += 1;
            }if(idade > 15 && idade < 30){
                faixa2 += 1;
            }if(idade >30 && idade < 45){
                faixa3 += 1;
            }if(idade > 45 && idade < 60){
                faixa4 += 1;
            }else{
                faixa5 += 1;
            }
        }
        System.out.println("ate 15 anos :" + faixa1);
        System.out.println("De 16 ate 30 anos :" + faixa2);
        System.out.println("De 31 ate 45 anos :" + faixa3);
        System.out.println("De 46 ate 60 anos :" + faixa4);
        
        
        
        
        
        
        
        
    }
}
