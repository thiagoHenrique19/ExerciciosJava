package ExerciciosString;

import java.util.Scanner;

public class CifradeCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a palavra a ser criptografada: ");
        String mensagem = sc.nextLine();

        System.out.println("A qual o valor de K?");
        int K = sc.nextInt();
        //mensagem criptografada
        String mensagemCriptografada = criptografarCesar (mensagem, K);
        System.out.println("A mensagem criptografada é: " + mensagemCriptografada);

        //mensagem descriptogrifada
         StringBuilder mensagemDescriptografada = descriptografarCesar(mensagemCriptografada, K);
        System.out.println("A mensagem descriptografada é: " + mensagemDescriptografada);
    }
    public static String criptografarCesar(String mensagem, int K) {
        StringBuilder mensagemCriptografada = new StringBuilder();


        for (char c : mensagem.toCharArray()) {
            if (c == ' ') {
                mensagemCriptografada.append(('0'));
            } else {
                //calcula o valor da letra
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int limite = Character.isLowerCase(c) ? 'z' : 'Z';
                int novoCaractere = c + K;

                //ajusta caso passe do limite
                if (novoCaractere > limite) {
                    novoCaractere = base +
                            (novoCaractere - limite - 1);
                }
                mensagemCriptografada.append((char) novoCaractere);
            }
        }
        return mensagemCriptografada.toString();
    }
    public static StringBuilder descriptografarCesar(String mensagem, int K) {

        StringBuilder mensagemDescriptografada = new StringBuilder();

        for (char c : mensagem.toCharArray()) {

            if (c == 'a') {
                //vai cosniderar 'a' como espaço
                mensagemDescriptografada.append(' ');
            } else {
                // vai calcular o valor da letra
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int limite = Character.isLowerCase(c) ? 'z' : 'Z';
                int novoCaractere = c - K;

                //ajustar caso ultrapasse o limite
                if (novoCaractere < base) {
                     novoCaractere = limite +(base - novoCaractere - 1);
                }
                mensagemDescriptografada.append((char)novoCaractere);
            }
        }
        return mensagemDescriptografada;
    }
}


