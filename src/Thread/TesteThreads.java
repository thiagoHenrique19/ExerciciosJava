package Thread;

public class TesteThreads implements Runnable {

    //Atributos
    private char id;
    private final int num = 5;//somente um valor simbolico para mostrar a execução da Thread

    //Getter e Setter
    public int getId(){
        return id;
    }
    public void setId(char id) {
        this.id = id;
    }
    //Metodo sobrescrito da Interface Runnable
    @Override
    public void run() {
        for (int i = 0; i <= num; i++) {
            System.out.println(" Programa: " + id + " Valor: " + i);
        }
    }
}

//criação da classe de teste de Thread