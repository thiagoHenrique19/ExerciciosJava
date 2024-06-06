package Exercicios.LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioLacosD43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int salario = 0;
     int feria = 0;
     int decimo = 0;
     int novoSal = 0;
     int qntdMes = 0;
     int opc = 0;

        System.out.println("Informe o salario: ");
        salario= scanner.nextInt();
        System.out.println("Diga qual foi a quantidade de meses trabalhados: ");
        qntdMes= scanner.nextInt();
        System.out.println("1---calcular um novo salario.");
        System.out.println("2---calcular Ferias.");
        System.out.println("3---calcular Decimo Terceiro");
        System.out.println("4---sair");
        System.out.println("Escolha uma opção para calcular: ");
        opc= scanner.nextInt();
        if(salario <= 1050){
            boolean b = novoSal < (-salario + (salario * 0.15));
        }
        if(salario > 1500 && salario <= 2300){
            boolean b = novoSal <- salario +(salario * 0.1);
        }else{
            for (int i = 2; i < 3; i++) {
                System.out.println("O novo salario é: " + salario);
            }
            for (int i = 1; i < 2; i++) {
                System.out.println("O vslor das ferias é:" + feria);
            }
            for (int i = 3; i < 4; i++) {
                System.out.println("O valor do decimo: " + decimo);
            }
            for (int i = 4; i < 5; i++) {
                System.out.println("ops!Voce saiu");
            }
        }











    }
}
