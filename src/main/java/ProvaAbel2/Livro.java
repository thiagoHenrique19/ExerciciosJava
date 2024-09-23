package ProvaAbel2;
public class Livro
{
     String codigo;
     String titulo;
     String autor;
     int anoPublicado;

    public Livro(String codigo, String titulo, String autor, int publicado) {
    }
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicado() {
        return anoPublicado;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
    public void exibirInformacoes(){
        System.out.println("codigo: " + codigo);
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("anoPublicado: " + anoPublicado);
    }
    public Livro(){

    }

    }


