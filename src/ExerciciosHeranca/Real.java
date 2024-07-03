package ExerciciosHeranca;

public class Real extends Complexo{
    //construtora
    public Real(float valor){
      super(valor,0); //vai chamar o construtor da classe base
    }
    //metodo que vai retornar o sinal do numero
    public int Sinal(){
        return getReal() >= 0 ? 1 : -1;
    }
}