package Network;

import java.io.PrintStream;
import java.net.Socket;

public class Cliente2 {
    public static void main(String[] args) {

        try {
            //Declarar o socket cliente
            Socket cliente = new Socket("127.0.0.1", 7000);

            System.out.println("Cliente iniciando");

            //Fluxos de dados para envio
            PrintStream ps = new PrintStream(cliente.getOutputStream());

            ps.println("Oi, Prof. Miltin aqui: " + (int) (Math.random() * 10000));

            cliente.close();
            System.out.println("Cliente finalizado");
        }catch (Exception e){
            System.out.println("Ocorreou um erro durante a conexão");
        }
    }
}
