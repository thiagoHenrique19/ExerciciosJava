package RelacionamentoClasses;

public class CalcDados {

    private double operando1;
    private double oprerando2;
    private char operacao;

   public void setOperando(int i, double valor){
       if (i ==1){
          operando1 = valor;
       } else if (i ==2) {
           oprerando2 =valor;
       }
   }
   public double getOperando(int i){
       if (i == 1){
           return operando1;
       } else if (i == 2) {
           return oprerando2;
       }
       return 0;
   }
   public void setOperacao(char op){
       operacao = op;
   }
   public char getOperacao(){
       return operacao;
   }
}
