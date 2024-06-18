package RelacionamentoClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        String nome;

        //ler os dados dos alunos
        while (true){
            System.out.println("digite o nome do aluno ou('fim' para finalizar)");
            nome = sc.nextLine();
            if (nome.equals("fim")){
                break;
            }
            System.out.print("digite a primeira nota parcial");
            int primeiraNotaParcial = sc.nextInt();

            System.out.println("digite a segunda nota parcial");
             int segundaNotaParcial = sc.nextInt();
            sc.nextLine();//consumir o resto da linha

            Aluno aluno = new Aluno(nome,primeiraNotaParcial,segundaNotaParcial);
            alunos.add(aluno);
        }
        //calcular as estatisticas da turma

        double somarNotas = 0;
        int aprovados = 0;
        int recuperacao = 0;
         int reprovados = 0;

         for (Aluno aluno : alunos){
             double media = aluno.calcularMedia();
             somarNotas += media;

             if (media <= 7){
                 aprovados++;
             } else if (media <= 4) {
                 recuperacao++;
             }else{
                 reprovados++;
             }
         }

         double mediaTurma = alunos.isEmpty() ? 0 : somarNotas / alunos.size();

        System.out.println("Media da trurma " + mediaTurma);
        System.out.println("Numero de alunos aprovados " + aprovados);
        System.out.println("Numero de alunos em recuperacao " + recuperacao );
        System.out.println("Numero de alunos reprovaods " + reprovados);

        System.out.println("Alunos com notas abaixo da media da turma ");
        for (Aluno aluno : alunos){
            if (aluno.calcularMedia() <= mediaTurma){
                System.out.println(aluno.getNome());
            }
        }
        sc.close();
    }
}
