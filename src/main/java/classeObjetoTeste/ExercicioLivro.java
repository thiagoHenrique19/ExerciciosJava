package classeObjetoTeste;

public class ExercicioLivro {
    {

    }
    String titulo;
    String editora;
    int edicao;
    int ano;
    String autor;
    String tipoCapa;
    int qntdFolhas;
    String iSBN;
    String idioma;
    boolean aberto;


    void estudar(){
        if(this.aberto==false){
            System.out.println("Voce não pode estudar, o livro esta fechado.");
        }else{
            System.out.println("Bons estudos");
        }
    }
    void abrir(){
        this.aberto=true;
    }
    void fechar(){
        this.aberto=false;
    }
    void anotar(){
        if(this.aberto=false){
            System.out.println("Voce precisa abrir antes de anotar");
        }else{
            System.out.println("Anotado...");
        }
    }

    void status(){
        System.out.println("Titulo" + this.titulo);
        System.out.println("Editora" + this.editora);
        System.out.println("Edicao" + this.edicao);
        System.out.println("Ano" + this.ano);
        System.out.println("Tipo de capa:" + this.tipoCapa);
        System.out.println("Quantidade de folhas: " + this.qntdFolhas);
        System.out.println("ISBN:" + iSBN);
        System.out.println("Idioma: " + this.idioma);
        if(aberto){
            System.out.println("O livro esta aberto");
        }else{
            System.out.println("O livro esta fechado");
        }
    }

    public static void main(String[] args) {

       // Livro i = new Livro();
        //i.titulo = "Use a cabeça!Java";
        //I.Editora = "Alta Books";
        //I.edicao=2;
        //I.ano=2007;
        //I.autor="Thiago Henrique";
        //I.tipoCapa="Brochura";
        //I.qntdFolhas=796;
        //I.iSBN="9788576081739";
        //I.idioma="Portugues";

        //I.fechar();
        //I.estudar();
        System.out.println("******STATUS******");
       // I.status();
        System.out.println("******************");
    }


}
