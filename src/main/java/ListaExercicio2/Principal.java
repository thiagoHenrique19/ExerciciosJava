package ListaExercicio2;

public class Principal{
    public static void main(String[] args) {
        Reta reta1 = new Reta(5,4);
        Reta reta2 = new Reta(3,1,4,2);

        System.out.println("Reta1: " + reta1);
        System.out.println("Reta2: " + reta2);

        System.out.println("O ponto (5,9) pertence a reta 1? " + reta1.pertenceReta(5,9));
        System.out.println("O ponto (3,3) pertence a reta2? " + reta2.pertenceReta(3,4));

        double[] intersecao = reta1.pontoDeIntersecao(reta2);
        if (intersecao != null){
            System.out.println("Ponto de intersecao: (" + intersecao[0] + "," + intersecao[1] + ")");
        }else {
            System.out.println("As retas sao paralelas.");
        }
    }
}
