package ExerciciosHeranca;
//classe abstrata para poligono regular
abstract class PolReg2 {
    protected int numeroLados;
    protected double tamanhoLado;

    public PolReg2(int numeroLados, double tamanhoLado){
        this.numeroLados = numeroLados;
        this.tamanhoLado = tamanhoLado;
    }
    public double calcularPerimetro(){
        return numeroLados * tamanhoLado;
    }
    public double calcularAnguloInteiro(){
        return((numeroLados - 2)* 180.0) / numeroLados;
    }
    //metodo abstrato para calculo da area
    public abstract double calcularArea();

    public void exibirInformacoes(){
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Angulo Inteiro: " + calcularAnguloInteiro());
        System.out.println("Area: " + calcularArea());
    }
}
