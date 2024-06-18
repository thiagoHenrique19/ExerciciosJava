package Fluxos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SalvarDadosAluno {
    //vai receber os dados doas alunos e salvar em um arquivo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName = "student_data.txt";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome do aluno.");
                String nome = sc.nextLine();
                System.out.println("Digite o codigo do aluno.");
                int codigo = sc.nextInt();
                System.out.println("Digite a primeira nota do aluno.");
                int nota1 = sc.nextInt();
                System.out.println("Digite a segunda nota do aluno.");
                int nota2 = sc.nextInt();
                sc.nextLine();//para consumir a nova linha

                dos.writeByte(nome.length());//grava o valor int dentro do fluxo
                dos.writeBytes(nome);//guarda o valor bytes dentro do fluxo
                dos.writeByte(codigo);//guarda o valor int dentro do fluxo
                dos.writeByte(nota1);//guarda o valor int dentro do fluxo
                dos.writeByte(nota2);//gurada o valor int dentro do fluxo
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
