package OrientacaoObjeto;

public class Main3 {
    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton (Nova Jersey-Estados Unidos da America)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");

        Pessoa3 einstein = new Pessoa3("Albert Einstein "," 14/03/1879",princeton);
        Pessoa3 newton = new Pessoa3("Isaac Newton ", " 04/01/1643",cambridge);

        System.out.println(einstein.getInformacoes());
        System.out.println(newton.getInformacoes());
    }
}
