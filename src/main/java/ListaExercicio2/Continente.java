package ListaExercicio2;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    //contrutor que vai inicializar o nome do pais do continente
    public Continente(String nome){
        this.nome=nome;
        this.paises = new ArrayList<>();
    }
    //metodos para adicionar o pais no continente
    public void adicionarPais(Pais pais){
        this.paises.add(pais);
    }
    //metodo que vai retornar a dimensao do pais
    public double getDimensaoTotal(){
        double dimensaoTotal = 0;
        for (Pais pais: paises){
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }
    //metodo que retorna a populacao total do continente
    public long getPopulacaoTotal(){
        long PopulacaoTotal = 0;
        for (Pais pais : paises){
            PopulacaoTotal += pais.getPopulacao();
        }
        return PopulacaoTotal;
    }
    //metodo que retorna a densidade populacional do continente
    public double getDensidadePopulacional() {
        return getDensidadePopulacional() / getDimensaoTotal();
    }
    //metodo que retorna o pais com maior populacao no continente
    public Pais getPaisMaiorPopulacao(){
        if (paises.isEmpty()){
          return null;
        }
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises){
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()){
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }
    //metodo que retorna o pais com menor populacao no continente
    public Pais getPaisMenorPopulcao(){
        if (paises.isEmpty()){
            return null;
        }
        Pais menorPopulacao = paises.get(0);
        for (Pais pais : paises){
            if (pais.getPopulacao() > menorPopulacao.getPopulacao()){
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }
    //metodo que retorne um pais com maior dimensao
    public Pais getPaisMaiorDimensao(){
        if (paises.isEmpty()){
            return null;
        }
        Pais maiorDimensao = paises.get(0);
        for (Pais pais : paises){
            if (pais.getDimensao() > maiorDimensao.getDimensao()){
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }
    //metodo que reotrna um pais com menor dimensao
    public Pais getPaisMenorDimensao(){
        if (paises.isEmpty()){
            return null;
        }
        Pais menorDimensao = paises.get(0);
        for (Pais pais : paises){
            if (pais.getDimensao() > menorDimensao.getDimensao()){
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }
    //metodo que retorna a razao territorial do maior pais em relacao com o menor
    public double getRazaoTerritorial(){
        Pais maiorPais = getPaisMaiorDimensao();
        Pais menorPais = getPaisMenorPopulcao();
        if (maiorPais != null && menorPais != null){
            return maiorPais.getDimensao() / menorPais.getDimensao();
        }
        return 0;//ou lancar excecao,dependedo do caso
    }
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}
