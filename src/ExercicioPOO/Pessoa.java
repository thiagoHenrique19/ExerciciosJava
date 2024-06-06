package ExercicioPOO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {


        private String nome;
        private int idade;
        private LocalDate nascimento;

    public Pessoa(LocalDate nascimento, String nome) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void calcularIdade(LocalDate dataAtual) {
         this.idade = (int) ChronoUnit.YEARS.between(this.nascimento, dataAtual);
    }
    public int IformaIdade(){
        return idade;
    }
    public String InformaNome(){
        return nome;
    }
    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        nascimento.getYear();
    }
}

