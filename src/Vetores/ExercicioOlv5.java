package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOlv5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String[] frutas = {"Banana", "Laranja", "Uva", "Limão", "Acelora"};

        System.out.print("Digite o nome de uma fruta: ");
        String frutaUsuario = scanner.nextLine();

        boolean encontrada = false;

        for(String fruta : frutas){
            if(fruta.equalsIgnoreCase(frutaUsuario)){
                encontrada = true;
                break;
            }
        }
        if(encontrada){
            System.out.println("A fruta esta na lista.");
        }else{
            System.out.println("A fruta não esta na lista");
        }






















    }
}
