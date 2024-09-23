package Array;

import java.util.Scanner;

public class Ex3Array {

        int[] array;

        int numAtual;

        int maxElementos;

        //construtor que vai iniciar a array e as variaveis de controle tambem
    public Ex3Array( int tamanho){
            array = new int[tamanho];
            numAtual = 0;
            maxElementos = tamanho;
        }
        public boolean adicionar ( int n){
            if (numAtual < maxElementos) {
                array[numAtual] = n;
                numAtual++;
                return true;
            } else {
                return false;
            }
        }
        //calcular a media aritmetica
        public int calculaMedia () {
            if (numAtual == 0) {
                return 0;     //vai evitar a divisão por zero se não for informado nenhum elemento
            }
            int soma = 0;
            for (int i = 0; i < numAtual; i++) {
                soma += array[i];
            }
            return soma / numAtual;
        }
    }

        class Ex3ArrayControlety {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Qual o tamanho do array que voce quer instanciar? ");
                                int tamamnho = sc.nextInt();

              Ex3Array ex3Array = new Ex3Array(tamamnho);

                for (int i = 0; i < tamamnho; i++) {
                    System.out.println("Digite um numero: ");
                    int numero = sc.nextInt();
                    boolean sucesso = ex3Array.adicionar(numero);

                    if (!sucesso){
                        System.out.println("Erro ao adicionar numero, main.java.Array esta cheio");
                    }
                }
                int media = ex3Array.calculaMedia();
                System.out.println("A media aritmetica desses numeros armazenados é: " + media);




            }
        }


