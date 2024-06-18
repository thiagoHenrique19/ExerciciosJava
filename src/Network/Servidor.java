package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        try {
            ServerSocket servidor = new ServerSocket(7000);
            System.out.println("servidor iniciado...");

            while (true) {
                AtendeCliente ac = new AtendeCliente(servidor.accept());
                ac.start();
            }

            /*
                //Este codigo basicamente é oque faz o cliente

                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress());

                InputStreamReader fluxoDados = new InputStreamReader(cliente);
                BufferedReader dado = new BufferedReader(fluxoDados);
                System.out.println(dado.readLine());

                Thread.sleep(15000);

                System.out.println("Cliente finalizado" + cliente.getInetAddress());

                cliente.close();

            */
        }catch (Exception e){
            System.out.println("Ocorreu um erro");
        }
    }
}
