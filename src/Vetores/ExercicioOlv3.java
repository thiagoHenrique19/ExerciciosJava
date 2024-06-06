package Vetores;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioOlv3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];{

        }

        for(int i = 0; i < 10; i++){
            System.out.println("Digite as dez notas dos alunos");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for(double nota : notas){
            soma+= nota;
        }
        double media = soma / notas.length;

        System.out.println("A media da turma é: " + media);
    }
}
