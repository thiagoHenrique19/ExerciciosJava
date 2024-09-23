//package Network;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.Socket;
//
//public class AtendeCliente extends Thread{
//Socket cliente;
//
//AtendeCliente(Socket cli) {
//    this.cliente = cli;
//}
//@Override
//    public void run(){
//    System.out.println("Cliente conectado com thread (" + this.getId() + ") : " + cliente.getInetAddress());
//    InputStreamReader fluxoDados;
//    try {
//        fluxoDados = new InputStreamReader(cliente.getInputStream());
//
//        BufferedReader dado = new BufferedReader(fluxoDados);
//        System.out.println(dado.readLine());
//
//       Thread.sleep(15000);
//
//        System.out.println("Cliente Finalizado: " + cliente.getInetAddress());
//
//        cliente.close();
//    }catch (IOException e) {
//        //TODO Auto-generated catch block
//        e.printStackTrace();
//    }catch (InterruptedException e) {
//        //TODO Auto-generated catch block
//        e.printStackTrace();
//    }
//}
//}
