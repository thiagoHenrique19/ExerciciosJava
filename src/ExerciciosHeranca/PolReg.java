package ExerciciosHeranca;

public class PolReg {
    //protected torna o membor acessivel as classes do mesmo
    //pacote ou atraves de herança
    protected int numeroLados;
    protected double tamanhoLado;

    public PolReg(int numeroLados, double tamanhoLado){
        this.numeroLados = numeroLados;
        this.tamanhoLado = tamanhoLado;
    }
    public double calcularPerimetro(){
        return numeroLados * tamanhoLado;
    }
    public double calcularAnguloInteiro(){
       return ((numeroLados-2)*180.0)/ numeroLados;
    }
    public double calcularArea(){
        return 0;//nao é possivel calcular a area de um poligono regular generico
    }
    public void exibirInformacoes(){
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Angulo Inteiro: " + calcularAnguloInteiro());
        System.out.println("Area " + calcularArea());
    }
}
