package ExerciciosHerança;

class TrianguloEq extends PolReg{
    //classe para o triangulo equilatero
    public TrianguloEq(double tamanhoLado){
        super(3,tamanhoLado);
    }
    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4) * Math.pow(tamanhoLado,2);
    }
}
