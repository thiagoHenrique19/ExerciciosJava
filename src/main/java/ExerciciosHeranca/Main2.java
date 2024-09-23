package ExerciciosHeranca;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de objeto voce quer criar? ");
        System.out.println("1 - Poligono Regular");
        System.out.println("2 - Triangulo Equilatero");
        System.out.println("3 - Quadrado");
        int escolha = sc.nextInt();

        PolReg2 poligono = null;

        if (escolha == 1){
            System.out.println("Numero de lados: ");
            int numeroLados = sc.nextInt();
            System.out.println("Tamanho dos lados: ");
            double tamanhoLado = sc.nextDouble();
            poligono = new PolReg2(numeroLados,tamanhoLado) {
                @Override
                public double calcularArea() {
                    return 0;//n é possivel calcular a area de um poligono regular generico
                }
            };
        } else if (escolha == 2) {
            System.out.println("Tamanho dos lados: ");
            double tamanhoLado = sc.nextDouble();
            poligono = new TrianguloEq2(tamanhoLado);
        } else if (escolha == 3) {
            System.out.println("Tamanho dos lados: ");
            double tamanhoLado = sc.nextDouble();
            poligono = new TrianguloEq2(tamanhoLado);
        }else {
            System.out.println("Opção invalida.");
            sc.close();
            return;
        }
        poligono.exibirInformacoes();
        sc.close();
    }
}
