package ListaExercicio2;

public class Pessoa {
private String nome;
private Pessoa pai;
private Pessoa mae;

//construtor qque vai inicalizar os nomes e os antecessores
    public Pessoa(String nome,Pessoa pai,Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
  //construtor que inicializa os nome e coloca os antecessores como null
  public Pessoa(String nome){
        this(nome,null,null);
  }
  //vai verificar a igualdade semantica entr duas pessoas(mesmo nome e mesma mae)
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
     Pessoa outra = (Pessoa) obj;
        return nome.equals(outra.nome) &&
                (mae != null ? mae.equals(outra.mae) : outra.mae == null);
    }
   //verifica s duas pessoas sao irmas(mesmo pai e mesma mae)
    public boolean saoIrmaos(Pessoa outra){
        if (outra == null){
            return false;
        }
     return(pai != null ? pai.equals(outra.pai) : outra.pai == null) ||
             (mae != null ? mae.equals(outra.mae) : outra.mae == null);
    }
    //metodo que vai verificar se uma pessoa é antecessora da pessoa que recebeu a msg
    public boolean ehAntecessor(Pessoa outra) {
        if (outra == null) {
            return false;
        }
        return ehAntecessorRecursivo(outra);
    }
    //metodo recursivo para verificar antecessores
    public boolean ehAntecessorRecursivo(Pessoa outra){
        if (outra == null){
            return false;
        }
     if (this.equals(outra.pai) || this.equals(outra.mae)){
         return true;
     }
     return ehAntecessorRecursivo(outra.pai) || ehAntecessorRecursivo(outra.mae);
    }
}
