package JavaIO;

import java.io.*;

public class CriaLeArquivo {
    public static void main(String[] args) {
        File f = new File("ArquivoCriado.txt");

        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Esse texto esta sendo inserido");

            //insere uma nova linha
            bw.newLine();

            bw.write("Continua sendo inserido em uma nova linha");
            bw.newLine();

            bw.write("Continua sendo inserido em uma 3 linha");

            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //efetuando a leitura
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;

            //enquanto existe dados continua imprimindo
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch (IOException e){
            System.out.println("###### Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
