package MetodosAtributos;

public class Produto45 {

    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
