package ListaExercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List <Pais> froteiras;

    //construtor que vai iniciar o ISO,nome e dimensao
    public Pais(String codigoISO,String nome,Double dimensao){
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.froteiras = new ArrayList<>(40);//limite de 40 paises fronteira
    }
    //getters e setters para o ISO,nome e dimensao
    public String getCodigoISO() {
        return codigoISO;
    }
    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getPopulacao() {
        return populacao;
    }
    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    public List<Pais> getFroteiras() {
        return froteiras;
    }
   public void adicionarFronteira(Pais pais){
       if (this.froteiras.size() < 40) {
           this.froteiras.add(pais);
       }
    }
    //metodo que vai verificar se dois paises vao ser iguais ao ISO
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Pais outroPais = (Pais) obj;
        return codigoISO.equals(outroPais.codigoISO);
   }
   //metodo que informa se outro pais e limitrofe
    public boolean isLimitrofe(Pais outroPais){
        return this.froteiras.contains(outroPais);
    }
    //metodo que retorna a densidade populacional do pais
    public double densidadePopulacional(){
        return this.populacao / this.dimensao;
    }
    //metodo que vai retornar a lista de vizinhos comuns a dois paises
    public List<Pais> vizinhoComuns(Pais outroPais){
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : this.froteiras){
            if (outroPais.getFroteiras().contains(pais)){
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }
}
