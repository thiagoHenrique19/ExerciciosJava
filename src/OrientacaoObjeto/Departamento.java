package OrientacaoObjeto;

public class Departamento {
private String nome;
private Universidade2 universidade2;

public Departamento(String nome){
    this.nome=nome;
}
public String getNome(){
    return nome;
}
public void setUniversidade2(Universidade2 universidade2){
    this.universidade2=universidade2;
}
public Universidade2 getUniversidade2(){
    return universidade2;
}
}
