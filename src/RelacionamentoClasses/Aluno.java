package RelacionamentoClasses;

public class Aluno {
    private int primeiraNotaParcial;
    private int segundaNotaParcial;
    private String nome;

    public Aluno(String nome, int primeiraNotaParcial, int segundaNotaParcial){
        this.nome=nome;
        this.primeiraNotaParcial=primeiraNotaParcial;
        this.segundaNotaParcial=segundaNotaParcial;
    }
    public int getPrimeiraNotaParcial(){
        return primeiraNotaParcial;
    }
   public void setPrimeiraNotaParcial(int primeiraNotaParcial){
        this.primeiraNotaParcial = primeiraNotaParcial;
   }
   public int getSegundaNotaParcial(){
        return segundaNotaParcial;
   }
   public void setSegundaNotaParcial(int segundaNotaParcial){
        this.segundaNotaParcial = segundaNotaParcial;
   }
   public String getNome(){
        return nome;
   }
   public void setNome(String nome){
        this.nome=nome;
   }
   public double calcularMedia(){
       return (primeiraNotaParcial + segundaNotaParcial) / 2;
   }
}
