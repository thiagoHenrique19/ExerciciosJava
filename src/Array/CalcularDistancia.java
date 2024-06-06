package Array;

import java.util.Scanner;

public class CalcularDistancia {
    public static void main(String[] args) {

        int[][] tabela = lerTabela();
        int[] percurso = lerPercurso();
        int distanciaTotal = calcularDistancia(tabela, percurso);

        System.out.println("A distancia total percorrida é:" + distanciaTotal + " Km");
    }
    public static int[][] lerTabela(){

        int[][] tabela = {
                {00, 15, 30, 05, 12},
                {15, 00, 10, 17, 28},
                {30, 10, 00, 03, 11},
                {05, 17, 03, 00, 80},
                {12, 28, 11, 80, 00}};
        return tabela;
        }
        public static int[] lerPercurso(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o seu percurso, separados por virgulas(ex: 1,2,3,4,5,6,):");
            String input = sc.nextLine();
            String[] partes = input.split(",");
            int[] percurso = new int[partes.length];

            for (int i = 0; i < partes.length; i++) {
                percurso[i] = Integer.parseInt(partes[i]);
            }
            return percurso;
        }
        public static int calcularDistancia(int[][] tabela, int[] percurso){
        int distanciaTotal = 0;
            for (int i = 0; i < percurso.length - 1; i++) {
             int cidadeAtual = percurso[i] -1;
             int proximaCidade = percurso[i + 1] - 1;
             distanciaTotal += tabela[cidadeAtual][proximaCidade];
            }
            return distanciaTotal;
        }
    }

