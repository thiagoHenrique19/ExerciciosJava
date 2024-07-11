package ListaExercicio2;

import java.util.Arrays;

public class Principal5 {
    public static void main(String[] args) {
      Conjunto conjunto1 = new Conjunto();

      conjunto1.adicionar("A");
      conjunto1.adicionar("B");
      conjunto1.adicionar("C");

      Conjunto conjunto2 = new Conjunto();
      conjunto2.adicionar("B");
      conjunto2.adicionar("C");
      conjunto2.adicionar("D");

      Conjunto uniao = conjunto1.uniao(conjunto2);
        System.out.println("Uniao: " + Arrays.toString(uniao.getElementos()));//A,B,C,D

        Conjunto inter = conjunto1.inter(conjunto2);
        System.out.println("Intersecao: " + Arrays.toString(inter.getElementos()));//B,C

        Conjunto menos = conjunto1.menos(conjunto1.menos(conjunto2));
        System.out.println("Subtracao: " + Arrays.toString(menos.getElementos()));//A
    }
}
