package ListaExercicio2;

public class Contador {
    //atributo para armazenar o valor do contador
    private int valor;

    //construtor para inicializar o contador com zero
    public Contador(){
        this.valor=0;
    }
    //metodo para zerar o valor do contaodr
    public void zerar(){
        this.valor=0;
    }
    //metodo para incrementar o valor do contador
    public void incrementar(){
        this.valor++;
    }
    //metodo parar retornar o valor do contador
    public int getValor(){
        return this.valor;
    }
    //metodo principal para testar a classe Contador
    public static void main(String[] args) {
        Contador contador = new Contador();

        //testar os metodos da classe Contador
        System.out.println("Valor inicial: " + contador.getValor());//deve imprimir 0

       contador.incrementar();
        System.out.println("Valor apos incrementar: " + contador.getValor());//deve imprimir 1

       contador.zerar();
        System.out.println("Valor apos zerar: " + contador.getValor());//deve imprimir 0

    }
    }
