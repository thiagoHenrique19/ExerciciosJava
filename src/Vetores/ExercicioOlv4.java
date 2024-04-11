package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOlv4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[10];
        double[] notas = new double[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o nome do aluno: ");
            nome[i] = scanner.nextLine();
            System.out.println("Digite a nota do aluno: ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        double MeidaTurma = soma / notas.length;

        System.out.println("Alunos com nota maior ou igual a media da turma");
        for(int i = 0; i < 10; i++){
            if(notas[i] >= MeidaTurma){
                System.out.println(nome[i]);
            }
        }













    }
}
