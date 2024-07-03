package ExerciciosHeranca;

public class Teste {
    public static void main(String[] args) {
        //teste da classe Complexo
        Complexo c = new Complexo(3,4);

        System.out.println("Parte Real: " + c.getReal());
        System.out.println("Parte Imaginaria: " + c.getImag());
        System.out.println("Modulo: " + c.Modulo());
        System.out.println("Angulo: " + c.Angulo());

        //teste da classe real
        Real r1 = new Real(5);
        System.out.println("Valor de r1: " + r1.getReal());
        System.out.println("Sinal de r1: " + r1.Sinal());

        Real r2 = new Real(-7);
        System.out.println("Valor de r2: " + r2.getReal());
        System.out.println("Sinal de r2: " + r2.Sinal());
    }
}
