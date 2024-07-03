package ListaExercicio2;

public class Ponto2D {
    //atributos para armazenar as cordenadas do ponto
    private double x;
    private double y;
    //construtor default que inicializa o ponto na origem(0,0)
    public Ponto2D(){
        this.x=0.0;
        this.y=0.0;
    }
    //construtor que inicializa o ponto com os valores fornecidos
    public Ponto2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    //construtor que inicializa o ponto com outro ponto
    public Ponto2D(Ponto2D ponto){
        this.x=ponto.x;
        this.y=ponto.y;
    }
    //metodo getter para os atributos
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //metodo setter para os atributor
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    //metodos de movimentar do ponto
    public void moverPara(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void moverPara(Ponto2D ponto){
        this.x = ponto.x;
        this.y = ponto.y;
    }
   //metodo de comparacao semantica do ponto
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
     if (obj == null || getClass() != obj.getClass()){
         return false;
     }
     Ponto2D ponto = (Ponto2D) obj;
     return Double.compare(ponto.x,x) == 0 && Double.compare(ponto.y,y) == 0;
    }
    //metodo de representacao do objeto como string
    @Override
    public String toString(){
        return "Ponto2D{" + "x=" + x + "y=" + y + "}";
    }
    //metodo para calcular a distancia para outro ponto
    public double distanciaPara(Ponto2D ponto){
        double deltaX = ponto.x - this.x;
        double deltaY = ponto.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY );
    }
    //metodo para clonar o ponto
    public Ponto2D clonar(){
        return new Ponto2D(this);
    }
    //metodo principal para testar a classe Ponto2D
    public static void main(String[] args) {
        //testar os contrutores
        Ponto2D ponto1 = new Ponto2D();//origem
        Ponto2D ponto2 = new Ponto2D();//coordenadas especifiicas
        Ponto2D ponto3 = new Ponto2D();//outro ponto

        //exibir os pontos
        System.out.println(ponto1);//deve imprimir Ponto2D{x=0.0,y=0.0
        ponto2.moverPara(3,4);
        System.out.println(ponto2);//deve imprimir Ponto2D{x=3.0,y=4.0
        ponto3.moverPara(3,4);
        System.out.println(ponto3);//deve imprimir Ponto2D{x=3.0,y=4.0

        //testar os metodos de movimentacao
        ponto1.moverPara(1,1);
        System.out.println(ponto1);//deve imprimir Ponto2D{x=1.0,y=1.0
        ponto1.moverPara(ponto2);
        ponto2.moverPara(3,4);
        System.out.println(ponto1);//deve imprimir Ponto2D{x=3.0,y=4.0

        //testando os metodos equals
        System.out.println(ponto2.equals(ponto3));//deve imprimir true
        System.out.println(ponto1.equals(ponto3));//deve imprimir true

        //testando o metodo de distancia
        System.out.println(ponto2.distanciaPara(new Ponto2D()));//deve imprimir 5.0(distancia para a origem)

        //testar o metodo clonar
        Ponto2D ponto4 = ponto2.clonar();
        ponto4.moverPara(3,4);
        System.out.println(ponto4);//vai imprimir Ponto2D{x=3.0,y=4.0}
        System.out.println(ponto2.equals(ponto4));//deve imprimir true
    }
}
