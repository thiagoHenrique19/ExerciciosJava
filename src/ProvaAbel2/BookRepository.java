package ProvaAbel2;

import java.util.*;

public class BookRepository {
    private Map<String, Livro> livros;
    public BookRepository() {
        livros = new HashMap<>();
    }
    public void addBook(Livro livro) {
        livros.put(livro.getCodigo(), livro);
    }
    public Livro searchBookByCode(String codigo) throws LivroNaoEncontradoException {
        Livro livro = livros.get(codigo);
        if (livro == null) {
            throw new LivroNaoEncontradoException();
        }
        return livro;
    }
}
