package OrientacaoObjeto;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa2 {
    private String nome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private int idade;

    //construtor
    public Pessoa2(String nome, int diaNasc, int mesNasc, int anoNasc){
        this.nome = nome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual){
        LocalDate dataNascimento = LocalDate.of(this.anoNasc, this.mesNasc, this.diaNasc);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }
    public int informaIdade(){
        return this.idade;
    }
    public String informaNome(){
        return this.nome;
    }
}
