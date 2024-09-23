package OrientacaoObjeto;

public class Main {
    public static void main(String[] args) {
        //data atual
       int diaAtual = 13;
       int mesAtual = 6;
       int anoAtual = 2024;

       //instanciar os objetos
        Pessoa einstein = new Pessoa("Albert Einstein",14,3,1879);
        Pessoa newton = new Pessoa("Isaac Newton",4,1,1643);

        //calcular as idades
        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        //Resultados
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos se estivesse vivo");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos se estivesse vivo" );
    }
}
