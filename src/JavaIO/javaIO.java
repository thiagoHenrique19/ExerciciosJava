package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class javaIO {
    //Neste exemplo sera lido Strings digitadas pelo usuario
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        System.out.println("Digite um texto: ");

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String digitado = br.readLine();

        while (digitado != null){
            System.out.println("Texto digitado: " + digitado);
            digitado = br.readLine();
        }
    }
}
