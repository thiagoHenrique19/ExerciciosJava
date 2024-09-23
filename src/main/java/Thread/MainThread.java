package Thread;

public class MainThread {
    /**
     * @param args
     *             the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        TesteThreads p1 = new TesteThreads(); //Criando o objeto TesteThreads
        p1.setId('A'); //Atribuindo o ID a ele

        Thread t1 = new Thread(p1);//Criando a main.java.Thread e passando objeto criada acima para ela
        t1.start();//Iniciando o main.java.Thread

        TesteThreads p2 = new TesteThreads();
        p2.setId('B');

        Thread t2 = new Thread(p2);
        t2.start();

        TesteThreads p3 = new TesteThreads();
        p3.setId('C');

        Thread t3 = new Thread(p3);
        t3.start();
    }
}
