package OrientacaoObjeto;

public class Pessoa4 {
    private String nome;
    private Departamento departamento;

    public Pessoa4(String nome,Departamento departamento){
        this.nome=nome;
        this.departamento=departamento;
    }
    public String getNome(){
    return nome;
    }
    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento=departamento;
    }
}
