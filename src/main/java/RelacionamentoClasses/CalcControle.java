package RelacionamentoClasses;

public class CalcControle {
    private CalcDados dados;
    private CalcInterface interf;
    public CalcControle(CalcDados dados, CalcInterface interf){

        this.dados = dados;
        this.interf = interf;
    }
    public void executar(){
    while (true) {
        dados.setOperando(1, interf.recebeOperando(1));
        dados.setOperando(2, interf.recebeOperando(2));
        dados.setOperacao(interf.recebeOperacao());
        if (dados.getOperacao() == 's') {
            System.exit(0);
        }
        double resultado = opera(dados.getOperando(1), dados.getOperando(2), dados.getOperacao());
        interf.mostrarResultado(resultado);
        dados.setOperando(1, resultado);//vai utilizar o primeiro operando para a proxima conta
       }
    }
       private double opera(double opn1,double opn2,char op){
        switch (op){
            case '+':
                return opn1 + opn2;
            case '-':
                return opn1 - opn2;
            case '*':
                return opn1 * opn2;
            case '/':
                if (opn2 != 0){
                 return opn2 != 0 ? opn1/opn2 : Double.NaN;
                }else {
                    System.out.println("Erro! Voce esta tentando dividir por zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Operacao invalida.");
                return Double.NaN;
        }
    }
}
