package ExerciciosHeranca;

public class Aluno extends Pessoa{
    private String curso;

    //contrutor

    public Aluno() {
    }
    public Aluno(String nome, int idade, String curso){
        super(nome,idade);
        this.curso = curso;
    }
    //redefinição do metodo para mostrar os dados do aluno

    public void mostraDados(){
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Idade do aluno: " + getIdade());
        System.out.println("Curso do aluno: " + curso);
    }
    //getters e setters
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
