package ProvaAbel2;

public class LivroNaoEncontradoException extends RuntimeException {
    public String getMessege() {
        return ("ERRO: Livro não encontrado dentro de nosso sistema");
    }
}
