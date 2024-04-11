package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf8B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //crie tres variaveis envolvendo notas
        int nota1;
        int nota2;
        int nota3;



        //solicite ao usuario algumas notas
        //me diga uma nota
        System.out.println("Me diga uma nota nota. ");
        nota1 = scanner.nextInt();
        //me diga mais uma nota
        System.out.println("Me diga mais uma nota. ");
        //me diga mais uma nota
        System.out.println("Me diga mais uma nota. ");
        //faça a soma total das tres notas informadas
        int calculo1 = nota1 ;
        //pegue a soma das notas e divida pelo numero de notas informadas
        int media = calculo1 / 3;
        //apresente o valor da media
        System.out.println("O valor da media é de: " + media);
        //se a media for maior ou igual a nove apresente a mensagem "Excelente"
        if(media >= 9){
            System.out.println("Execelente");
        }
        //se a media for menor que nove e maior ou igual a sete apresente a mensagem"Muito bom"
        if(media >= 7){
            System.out.println("Muito bom");
        }
        //se a media for menor que sete e maior ou igual a seis apresente a mensagem "Bom"
        if(media >= 6){
            System.out.println("Bom");
        }
        //se a media for menor que seis e maior ou igual a cinco apresente a mensagem"Regular"
        if(media >= 5){
            System.out.println("Regular");
        }
        //se a media for menor que cinco apresente a mensagem"Insuficiente"
        if(media >=4){
            System.out.println("Insuficiente");
        }







    }
}
