package ListaExercicio2;

public class Circulo {
    private double raio;
    double centroX;
    double centroY;

    //construtor que recebe o raio e um ponto(centro do ciruclo)
    public Circulo(double raio,double centroX, double centroY){
        this.raio=raio;
        this.centroX = centroX;
        this.centroY = centroY;
    }
    //construtor que recebe o raio e posiciona o circulo na origem
    public Circulo(double raio){
        this(raio,0,0);
    }
    //metodo de acesso ao riao para o circulo
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    //metodo inflar que aumenta o raio do circulo de um dado valor
    public void inflar(double valor){
        raio += valor;
    }
    //metodo desinflar que vai diminuir o raio do ciruclo de um dado valor
    public void desinflar(double valor){
        if (raio - valor < 0){
            throw new IllegalArgumentException("O raio nao pode ser negativo");
        }
        raio -= valor;
    }
   //metodos sobrecarregados inflar e desinflar(uma unidade)
   public void inflar(){
        inflar(1);
   }
   public void desinflar(){
        desinflar(1);
   }
   //metodos sobrecarregados mover
    //i)leva o ciruclo para a origem do espaco 2D
    public void mover(){
        this.centroX = 0;
        this.centroY = 0;
    }
    //ii)move o circulo para um local indicado por dois parametros
    public void mover(double novoX,double novoY){
        this.centroX = novoX;
        this.centroY = novoY;
    }
    //iii)move o ciruclo para o local indicado por parametros do tipo double
    public void mover(double[] ponto){
        if (ponto.length != 2){
            throw new IllegalArgumentException("O ponto deve ter exatamente duas coordenadas");
        }
        mover(ponto[0],ponto[1]);
    }
    //metodo que vai retornar a area do circulo
    public double getArea(){
        return Math.PI * raio * raio;
    }
}
