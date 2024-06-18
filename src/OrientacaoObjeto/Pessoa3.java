package OrientacaoObjeto;

public class Pessoa3 {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;
    public Pessoa3(String nome, String dataNascimento, Universidade universidade){
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.universidade=universidade;
    }
    public String getNome(){
        return nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public Universidade getUniversidade(){
     return universidade;
    }
    public String getInformacoes(){
        return nome + "nasceu em" + dataNascimento + " e trabalha na universidade de " + universidade.getNome();
    }
}
