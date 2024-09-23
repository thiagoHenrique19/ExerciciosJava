package ExerciciosHeranca;

import java.util.Scanner;
public class Main{
    //classe principal para interagir com o usuario
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que tipo de projeto voce quer criar? ");
        System.out.println("1 - Poligono Regular");
        System.out.println("2 - Triangulo Equilatero");
        System.out.println("3 - Quadrado");
        int escolha = sc.nextInt();

        PolReg poligono = null;
        PolReg triangulo = null;
        PolReg quadrado = null;

        if (escolha == 1){
            System.out.println("Numero de lados: ");
            int numeroLados = sc.nextInt();
            System.out.println("tamanho dos lados");
            double tamanhoLados = sc.nextDouble();
            poligono = new PolReg(numeroLados, tamanhoLados);
            poligono.exibirInformacoes();
        } else if (escolha == 2) {
            System.out.println("tamanho dos lados: ");
            double tamanhoLado = sc.nextDouble();
            triangulo.calcularArea();
        } else if (escolha == 3) {
            System.out.println("tamanho dos lados");
            double lados = sc.nextDouble();
            quadrado.calcularArea();
        } else{
            System.out.println("Opcao invalida.");
            sc.close();
            return;
        }
    }
}
