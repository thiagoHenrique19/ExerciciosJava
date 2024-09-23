package MetodosAtributos;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 19;
        d1.mes = 7;
        d1.ano = 2007;

        var d2 = new Data();
        d2.dia = 20;
        d2.mes = 7;
        d2.ano = 2007;

       String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }





}
