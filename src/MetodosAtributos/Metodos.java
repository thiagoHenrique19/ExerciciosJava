package MetodosAtributos;

public class Metodos {
    String dia;

    int mes;
    int ano;

    String ObterData(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void ImprimirDataFormatada(){
        System.out.println(ObterData());
    }
}
