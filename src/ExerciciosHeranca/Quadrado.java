package ExerciciosHeranca;

class Quadrado extends PolReg{
    //classe derivada para quadrado
    public Quadrado(double tamanhoLado){

    super(4,tamanhoLado);
    }
    @Override
    public double calcularArea(){
        return Math.pow(tamanhoLado,2);
    }
}
