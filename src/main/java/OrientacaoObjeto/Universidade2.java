package OrientacaoObjeto;

public class Universidade2 {
    private String nome;
    private Departamento[] departamentos;
    private int numDepartamentos;

    public Universidade2(String nome){
        this.nome=nome;
        this.departamentos=new Departamento[50];
        this.numDepartamentos= 0;
    }
    public String getNome(){
        return nome;
    }
    public boolean adicionarDepartamento(Departamento departamento){
        if (numDepartamentos < 50){
           departamentos[numDepartamentos] = departamento;
           numDepartamentos++;
           departamento.setUniversidade2(this);
           return true;
        }
        return false;
    }
    public Departamento[] getDepartamentos() {
        return departamentos;
    }
}
