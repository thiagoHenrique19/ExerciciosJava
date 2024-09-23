package OrientacaoObjeto;

public class Main4 {
    public static void main(String[] args) {
        //criar as universidades

        Universidade2 universidade1 = new Universidade2("Universidade A");
        Universidade2 universidade2 = new Universidade2("Universidade B");

        //criando departamentos e tbm associando as universidades
        Departamento depto1 = new Departamento("Departamento de ciencias");
        Departamento depto2 = new Departamento("Departatamento de Humanidades");
        Departamento depto3 = new Departamento("Departamento de Engenharia");

        universidade1.adicionarDepartamento(depto1);
        universidade1.adicionarDepartamento(depto2);
        universidade2.adicionarDepartamento(depto3);

        //criando pessoas e associando-as aos departamentos
        Pessoa4 pessoa1 = new Pessoa4("Alice",depto1);
        Pessoa4 pessoa2 = new Pessoa4("Bob",depto2);
        Pessoa4 pessoa3 = new Pessoa4("Charlie",depto3);

        //exibir as informacoes
        System.out.println(pessoa1.getNome() + " trabalha no " + pessoa1.getDepartamento().getNome()
                + " da " + pessoa1.getDepartamento().getUniversidade2().getNome());

        System.out.println(pessoa2.getNome() + " trbalha no " + pessoa2.getDepartamento().getNome()
        + " da " + pessoa2.getDepartamento().getUniversidade2().getNome());

        System.out.println(pessoa3.getNome() + " trabalha no " + pessoa2.getDepartamento().getNome()
        + " da " + pessoa3.getDepartamento().getUniversidade2().getNome());
    }
}
