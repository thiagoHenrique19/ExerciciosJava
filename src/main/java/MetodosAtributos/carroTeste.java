package MetodosAtributos;

public class carroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.nome = "polo";
        c1.marca = "volkswagen";
        c1.ano = 2018;
        c1.vel = 70;

        c1.acelerar(20);

        System.out.println("Velocidade no momendo é de " + c1.vel + "km/h");
    }
}
