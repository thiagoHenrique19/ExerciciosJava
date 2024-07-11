package ListaExercicio2;

import java.sql.SQLOutput;

public class Principal6 {
    public static void main(String[] args) {
        Matriz m1 = new Matriz(2,2,new double[][]{{1,2},{3,4}});
        Matriz m2 = new Matriz(2,2,new double[][]{{5,6},{7,8}});

        System.out.println("Matriz 1:");
        System.out.println(m1);

        System.out.println("Matriz 2:");
        System.out.println(m2);

        m1.adicionar(m2);
        System.out.println("Matriz 1 apos adicionar Matriz 2:");
        System.out.println(m1);

        m1.subtrair(m2);
        System.out.println("Matriz 1 apos subtrair Matriz 2:");
        System.out.println(m1);

        System.out.println("Transporta da Matriz 1:");
        System.out.println(m1.transporta());

        System.out.println("Oposta de Matriz 1:");
        System.out.println(m1.oposta());

        System.out.println("Matriz identidade: ");
        Matriz identidade = new Matriz(2,2,new double[][]{{1,0},{0,1}});
        System.out.println(identidade.ehIdentidade());

        System.out.println("Copia da Matriz 1:");
        Matriz copia = m1.copiar();
        System.out.println(copia);

        System.out.println("Multiplicacao de Matriz 1 por Matriz 2:");
        m1.multiplicar(m2);
        System.out.println(m1);
    }
}
