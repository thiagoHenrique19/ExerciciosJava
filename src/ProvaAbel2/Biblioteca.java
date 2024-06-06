package ProvaAbel2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookRepository repository = new BookRepository();

        Livro livro1 = new Livro();

        System.out.println("Quantos livros serão cadastrados? ");
        int qntdNumeros = sc.nextInt();

        for (int i = 0; i < qntdNumeros; i++) {
            System.out.println("Codigo do livro?  ");
             String codigo = sc.nextLine();
             livro1.setCodigo(codigo);
             sc.nextLine();
            System.out.println("Titulo do livro?  ");
            String titulo = sc.nextLine();
            livro1.setTitulo(titulo);
            System.out.println("Autor do livro?  ");
            String autor = sc.nextLine();
            livro1.setAutor(autor);
            System.out.println("Em qual ano foi publicado o livro?  ");
            int publicado = sc.nextInt();
            livro1.setAnoPublicado(publicado);
            sc.nextLine();
            repository.addBook(livro1);
        }
        System.out.println("Pesquise qual o codigo do livro(caso queira sair digite'fim'): ");
        String codPesquisa = sc.nextLine();
        while (
                codPesquisa.equals("fim")) {
        }
        try {
          Livro livroEncontrado = repository.searchBookByCode(codPesquisa);
          livroEncontrado.exibirInformacoes();
       } catch (LivroNaoEncontradoException e) {
           e.printStackTrace();
        }
        System.out.println("Pesquisar outro livro em codigo ou digite 'fim' para o programa ser finalizado: ");
        codPesquisa = sc.nextLine();
    }
        }

