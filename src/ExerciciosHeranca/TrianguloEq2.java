package ExerciciosHeranca;

class TrianguloEq2 extends PolReg2 { //classe para o triangulo equilatero
    public TrianguloEq2(double tamanhoLado){
        super(3,tamanhoLado);
    }
    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4) * Math.pow(tamanhoLado,2);
    }

}
