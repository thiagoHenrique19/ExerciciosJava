package RelacionamentoClasses;

public class Principal {
    public static void main(String[] args) {
        CalcDados dados = new CalcDados();
        CalcInterface interf = new CalcInterface();
        CalcControle controle = new CalcControle(dados,interf);
        controle.executar();
    }
}
