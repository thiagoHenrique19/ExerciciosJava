package Fluxos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LerDadosAluno {
    //Ler os dados dos aqrquivos e calcular as informações
    public static void main(String[] args) {

        String fileName = "student_data.txt";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            int totalNotas = 0;
            int totalAlunos = 0;
            int aprovados = 0;
            int exames = 0;
            int reprovados = 0;

            while (dis.available() > 0){
                int nomeLenght = dis.readInt();

             byte[] nomeBytes = new byte[nomeLenght];
             dis.readFully(nomeBytes);

             String nome = new String(nomeBytes);

             int codigo = dis.readInt();
             int nota1 = dis.readInt();
             int nota2 = dis.readInt();

             int media = (nota1+nota2)/2;
             totalNotas += media;
             totalAlunos++;
             if (media >= 7){
                 aprovados++;
                 System.out.println(nome + " foi aprovado.");
             } else if (media >= 4){
                 exames++;
                 System.out.println(nome + " foi para exame.");
             }else{
                 reprovados++;
                 System.out.println(nome + " foi reprovado.");
             }
            }
            double mediaTurma = (double) totalNotas / totalAlunos;

            System.out.println("A media da torma foi de: " + mediaTurma);

            System.out.println("O total de alunos aprovados foi de: " + aprovados);

            System.out.println("O total de alunos em exame é de: " + exames);

            System.out.println("O total de reprovados foi de: " + reprovados);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
