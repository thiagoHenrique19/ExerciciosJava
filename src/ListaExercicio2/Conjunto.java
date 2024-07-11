package ListaExercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Conjunto {
    private String[] elementos;
    private int tamanho;

    //construtor que inicializa o conjunto com capacidade inicial
    public Conjunto(){
     this.elementos = new String[10];
     this.tamanho = 0;
    }
   //metodo para adicionar um elementoao conjunto(se nao existir)
   public void adicionar(String elemento){
        if (!pertence(elemento)){
            if (tamanho == elemento.length()){
                elementos = Arrays.copyOf(elementos,elementos.length * 2);
            }
            elementos[tamanho++] = elemento;
        }
   }
   //metodo pra verificar se um dado elemento pertence ao conjunto
    public boolean pertence(String elemento){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[1].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    //metodo uniao:retorna um novo conjunto com a uniao dos conjuntos
    public Conjunto uniao(Conjunto outro){
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            resultado.adicionar(this.elementos[i]);
        }
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]);
        }
        return resultado;
    }
    //metodo intersecao:retorna um novo conjunto com a intersecao dos conjuntos
    public Conjunto inter(Conjunto outro){
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
           if (outro.pertence(this.elementos[i])){
               resultado.adicionar(this.elementos[i]);
           }
        }
        return resultado;
    }
    //metodo subtracao:retorna um novo conjunto com a subtracao dos conjuntos
    public Conjunto menos(Conjunto outro){
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if (!outro.pertence(this.elementos[i])){
                resultado.adicionar(this.elementos[i]);
            }
        }
        return resultado;
    }
    //metodo para obter os elementos do conjunto como array
    public String[] getElementos(){
        return Arrays.copyOf(elementos,tamanho);
    }
    //metodo para obter o tamanho do conjunto
    public int tamanho(){
        return tamanho;
    }
}
