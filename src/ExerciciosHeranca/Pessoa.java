package ExerciciosHeranca;

public class Pessoa {
    private String nome;
    private int idade;

    //contrutor

    public Pessoa() {
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //metodos para mostrar os dados das pessoas
    public void mostrarDado(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
    }

    //getters
    public String getNome(){
        return nome;
    }

    //setters
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
