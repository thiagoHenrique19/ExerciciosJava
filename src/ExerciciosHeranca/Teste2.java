package ExerciciosHeranca;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        System.out.println("Voce deseja instanciar um aluno ou uma pessoa? (a/p)");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("p")){
            System.out.println("Digite o nome do aluno.");
            String nome = sc.nextLine();

            System.out.println("Digite a idade do aluno.");
            int idade = sc.nextInt();

            pessoa = new Pessoa(nome,idade);
            pessoa.mostrarDado();

        } else if (escolha.equalsIgnoreCase("a")) {
            System.out.println("Digite o nome da pessoa.");
            String nome = sc.nextLine();

            System.out.println("Digite a idade da pessoa.");
            int idade = sc.nextInt();

            System.out.println("Digite o curso do aluno.");
            String curso = sc1.nextLine();


            aluno = new Aluno(nome,idade,curso);
            aluno.mostraDados();

        }


        sc.close();
    }
}
