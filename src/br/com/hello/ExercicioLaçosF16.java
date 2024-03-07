package br.com.hello;

import java.util.Scanner;

public class ExercicioLaçosF16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int cont = 1;
        double altura;
        double somaAltura = 0;
        double alturaX = 0;
        double peso;
        int idadeX = 0;
        int  pesoX = 0;


        do {
            System.out.println("Digite uma idade");
            idade = scanner.nextInt();

            System.out.println("Digite uma altura");
            altura = scanner.nextDouble();

            System.out.println("Digite um peso");
            peso = scanner.nextDouble();

            //prssoas com idade maior que 50 anos
            if (idade > 50) {
                idadeX++;//conta a quantidade de pessoas
            }
            //pessoas com idade entre 10 e 20 anos
            if ((idade >= 10) && (idade <= 20)) {
                alturaX++;
                somaAltura = altura + somaAltura;//somar a altura atual com a de antes
            }
            //pessoas com peso menor que 40
            if (peso < 40) {
                pesoX++;
            }
            cont++;
            System.out.println("\n");
        } while (cont <= 4);

        if (idadeX > 0) {
            //caso tenha pessoas maiores de 18 anos
            System.out.println("Quantidade de pessoas com idade  acima de 50 anos:" + idadeX + "\n");
        } else {
            //caso não tenha acima de 50 anos
            System.out.println("Nenhuma pessoa tem acima de 50 anos \n");
        }
        if (alturaX > 0) {
            //se tiver pessoas entre 10 a 20 anos
            System.out.println("A media de pessoas entre 10 e 20 anos é:" + (somaAltura / alturaX) + "\n");
        } else {
            //se nao tiver gente entre 10 a 20 anos
            System.out.println("Nenhuma pessoa tem idade entre 10 a 20 anos \n");
        }
        if (pesoX > 0) {
            //se tiver pessoas com o peso menor que 40 kgs
            System.out.println("A porcentagem de pessoas com peso inferio a 40 é:" + (pesoX * 100 / (cont - 1)) + "%");
        } else {
            //caso não tenha pessoas com menos de 40 kilos
            System.out.println("Nenhuma pessoa tem peso inferio a 40 kilos");
        }

    }

}