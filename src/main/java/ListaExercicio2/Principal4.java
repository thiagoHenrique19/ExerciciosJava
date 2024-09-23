package ListaExercicio2;

public class Principal4 {
    //metodo principal para testar
    public static void main(String[] args) {
        Pessoa avoPaterno = new Pessoa("Avo paterno");
        Pessoa avoMaterna = new Pessoa("Avo materna");
        Pessoa mae = new Pessoa("Pai",avoPaterno,null);
        Pessoa pai = new Pessoa("Mae",null,avoMaterna);

        Pessoa filho = new Pessoa("Filho",pai,mae);
        Pessoa filha = new Pessoa("Filha",pai,mae);

        //verificar a igualdade semantica
        System.out.println(filho.equals(filha));//falso nomes diferentes
        System.out.println(mae.equals(mae));//mesma pessoa

        //verificar se sao irmaos
        System.out.println(filho.saoIrmaos(filha));

        //verificar se é antecessor
        System.out.println(avoPaterno.ehAntecessor(filho));//avo é antecessor do filho
        System.out.println(avoMaterna.ehAntecessor(filho));//avo é antecessor
        System.out.println(pai.ehAntecessor(filho));
        System.out.println(mae.ehAntecessor(filho));
        System.out.println(filho.ehAntecessor(pai));
    }
}
