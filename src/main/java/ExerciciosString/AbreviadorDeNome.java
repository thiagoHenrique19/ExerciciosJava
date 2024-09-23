package ExerciciosString;

public class AbreviadorDeNome{
    public static void main(String[] args) {

        String nomeCompleto = "Thiago Henrique de Oliveira";
        String abreviatura = abreviarNome(nomeCompleto);
        System.out.println("Abreviatura: " + abreviatura);
    }

    public static String abreviarNome(String nomeCompleto) {

        String[] palavras = nomeCompleto.split(" ");

        //stringbuilder para armazenar a abreviatura
        StringBuilder abreviatura = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 2) {
                abreviatura.append(palavra.charAt(0)).append(".");
            } else {
                //vai adicionar a palavra completa caso tenha 2 ou menos letras
                abreviatura.append(palavra).append(".");
            }
        }
        //vai remover o espaço que tem de sobra"extra" no final da string
        if (abreviatura.length() > 0){
            abreviatura.setLength(abreviatura.length() - 1);
        }
        return abreviatura.toString();
    }
}
