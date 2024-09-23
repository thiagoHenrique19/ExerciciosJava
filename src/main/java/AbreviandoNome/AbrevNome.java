package AbreviandoNome;

public class AbrevNome {
    public static void main(String[] args) {

        String nomeCompleto = "Fernando Ricardo da Silva Pereira Santos";

        String abreviatura = abreviarNome(nomeCompleto);

        System.out.println("Seu nome abreviado:" + abreviatura);
    }
    public static String abreviarNome(String nomeCompleto){

        String[] palavras = nomeCompleto.split(" ");

        StringBuilder abreviatura = new StringBuilder();

        for (String palavra : palavras){
            if (palavra.length() > 2){
                abreviatura.append(palavra.charAt(0)).append(".");
            }else{
                abreviatura.append(palavra).append(".");
            }
        }
        if (abreviatura.length() > 0){
            abreviatura.setLength(abreviatura.length() - 1);
        }
        return abreviatura.toString();
    }
}
