package Thread;

public class TesteComThreads {

    public int variavelCompartilhada = 0;

    public static void main(String[] args) {

        new TesteComThreads().executar();
    }
    public void executar(){
        Thread segundoThread = new ThreadQueDecrementaValorDaVariavel(this);
        segundoThread.start();

        while (true){
            variavelCompartilhada++;
            System.out.println("Variavel vale: " + variavelCompartilhada);
            dormir(10);
        }
    }
    public void dormir(int milissegundos){
        try {
            //System.out.println(main.java.Thread.currentThread().getName() + "ira dormir por " + milissegundos + "milissegundos.")
            Thread.sleep(milissegundos);
        }catch (InterruptedException e){
            //Não precisa fazer nada
        }
    }
}
class ThreadQueDecrementaValorDaVariavel extends Thread {

    private TesteComThreads teste;

    public ThreadQueDecrementaValorDaVariavel(TesteComThreads teste) {
        this.teste = teste;
    }
    @Override
        public void run() {
            while (true) {
                teste.variavelCompartilhada--;
                System.out.println("Variavel vale: " + teste.variavelCompartilhada);
                teste.dormir(15);
                break;
            }
        }
    }
