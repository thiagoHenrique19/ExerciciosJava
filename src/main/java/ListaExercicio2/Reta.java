package ListaExercicio2;

public class Reta {
    private double coeficienteAngular;
    private double coeficienteLinear;

    //construtor a partir de coeficinete angular e coeficiente linear
    public Reta(double coeficienteRegular, double coeficienteLinear){
        this.coeficienteAngular = coeficienteRegular;
        this.coeficienteLinear = coeficienteLinear;
    }
   //construtor a paritr de dois pontos
   public Reta(double x1,double y1,double x2,double y2){
        if (x1 == x2){
            throw new IllegalArgumentException("Os pontos fornecidos tem a mesma coordenada x," +
                    "por tanto nao temos uma reta");
        }
        this.coeficienteAngular = (y2 - y1) / (x2 - x1);
        this.coeficienteLinear = y1 - this.coeficienteAngular * x1;
   }
   //getters
    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }
    public double getCoeficienteLinear() {
        return coeficienteLinear;
    }
    //metodo que verifica se um ponto pertence a reta
    public double pertenceReta(double x,double y){
        return y = coeficienteAngular * x + coeficienteLinear;
    }
    //metodo que gera e retorna a representacao String da reta
    public String toString(){
        return "y= " + coeficienteAngular + "x +" + coeficienteLinear;
    }
    //metodo que retorna o ponto de intersecao com outra reta
    public double[] pontoDeIntersecao(Reta outra){
        if (this.coeficienteAngular == outra.coeficienteAngular){
            return null;//as retas sao paralelas
        }
        double x = (outra.coeficienteLinear - this.coeficienteLinear)/(this.coeficienteAngular -
                outra.coeficienteAngular);
        double y = this.coeficienteAngular * x + this.coeficienteLinear;
        return new double[]{x,y};
    }
}

