package EstruturaDados;

public class Empregado {
    private String nome;
    private String cpf;
    private double salario;

    public Empregado(String nome,String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    @Override
    public String toString(){
        return "Empregado{ " + "NOME = '" + nome + "\"" + " CPF = "
                + cpf + "\"" + " SALARIO = " + salario +" }";

    }
}
