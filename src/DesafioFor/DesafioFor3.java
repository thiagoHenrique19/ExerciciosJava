package testes;

import java.util.Scanner;

public class DesafioFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valor = "#";
        for(int i = 1; i <=5; i++){
            System.out.println(valor);
            valor += "#";
        }
        for(String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
