package ListaExercicio2;

public class Principal2{
    public static void main(String[] args) {
        //metodo principal para testar a classe
        Circulo circulo1 = new Circulo(5,2,3);
        Circulo circulo2 = new Circulo(4);

        System.out.println("Circulo 1 - Raio: " + circulo1.getRaio() + ",Centro: (" + circulo1.centroX
        + "," + circulo1.centroY + ")");
        System.out.println("Circulo 2 - Raio: " + circulo2.getRaio() + ",Centro: (" + circulo2.centroX
        + "," + circulo2.centroY);
        circulo1.inflar(2);
        System.out.println("Circulo 1 apos inflar - Raio: " + circulo1.getRaio());
        circulo1.desinflar(1);
        System.out.println("Circulo 1 apos desinflar - Raio: " + circulo1.getRaio());
        circulo1.inflar();
        System.out.println("Circulo 1 apos inflar(uma unidade) - Raio: " + circulo1.getRaio());
        circulo1.desinflar();
        System.out.println("Circulo 1 apos desinflar(uma unidade) - Raio: " + circulo1.getRaio());
       circulo1.mover();
        System.out.println("Circulo 1 apos mover para a origem - Centro: (" + circulo1.centroX + ","
        + circulo1.centroY + ")");
        circulo1.mover(7,8);
        System.out.println("Circulo 1 apos mover para (7,8) - Centro: (" + circulo1.centroX + ","
        + circulo1.centroY + ")");
        circulo1.mover(new double[]{4,5});
        System.out.println("Circulo 1 apos mover para (4,5) -Centro: (" + circulo1.centroX + ","
        + circulo1.centroY + ")");
        System.out.println("Area do Circulo 1: " + circulo1.getArea());
    }
}
