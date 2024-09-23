package ExerciciosHeranca;

public class Quadrado2 extends PolReg2 {
    //classe derivada para quadrado
    public Quadrado2(double tamanhoLado){

        super(4,tamanhoLado);
    }
    @Override
    public double calcularArea(){
        return Math.pow(tamanhoLado,2);
    }
}
