package ListaExercicio2;

import java.util.Arrays;

public class Matriz {
    private int linhas;
    private int colunas;
    private double[][] matriz;
    public Matriz(int linhas,int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new double[linhas][colunas];
    }
   public Matriz(int linhas,int colunas,double[][] elementos){
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = elementos;
   }
   public double get(int i, int j){
        return matriz[i][j];
   }
   public void set(int i, int j,double valor){
        matriz[i][j] = valor;
   }
   public boolean equals(Matriz other){
        return Arrays.deepEquals(this.matriz,other.matriz);
   }
   public Matriz transporta(){
        Matriz transporta = new Matriz(colunas,linhas);
       for (int i = 0; i < linhas; i++) {
           for (int j = 0; j < colunas; j++) {
               transporta.set(j,i,matriz[i][j]);
           }
       }
       return transporta;
   }
   public Matriz oposta(){
     Matriz oposta = new Matriz(linhas,colunas);
       for (int i = 0; i < linhas; i++) {
           for (int j = 0; j < colunas; j++) {
               oposta.set(j,i,-matriz[i][j]);
           }
       }
       return oposta;
   }
   public static Matriz nula(int linhas, int colunas){
        return new Matriz(linhas,colunas);
}
   public boolean ehIdentidade(){
        if (linhas != colunas)return false;
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            if((i == j && matriz[i][j] != 1) || (i == j && matriz[i][j] != 0)) return false;
        }
    }
    return true;
}
  public boolean ehDiagonal(){
     if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (i != j && matriz[i][j] != 0) return false;
        }
    }
    return true;
    }
  public boolean ehSingular(){
        if (linhas != colunas) return false;
        double diagElement = matriz[0][0];
      for (int i = 1; i < linhas; i++) {
          if (matriz[i][i] != diagElement) return false;
      }
      return true;
  }
  public boolean ehSimetrical(){
        return this.equals(this.transporta());
  }
  public boolean ehAntiSimetrical(){
        return this.oposta().equals(this.transporta());
  }
  public void adicionar(Matriz other){
        if (linhas != other.linhas || colunas != other.colunas){
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensoes para adicao");
        }
      for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
              matriz[i][j] += other.get(i,j);
          }
      }
  }
  public void subtrair(Matriz other){
        if (linhas != other.linhas || colunas != other.colunas){
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensoes para subtracao");
        }
      for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
              matriz[i][j] -= other.get(i,j);
          }
      }
  }
  public void multiplicar(Matriz other){
        if (colunas != other.linhas){
            throw new IllegalArgumentException("O numero de colunas da primeira matriz deve ser igual" +
                    "ao numero de linhas da segunda matriz para multiplicacao");
        }
        Matriz resultado = new Matriz(linhas,other.colunas);
      for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < other.colunas; j++) {
              for (int k = 0; k < colunas; k++) {
                   resultado.matriz[i][j] += matriz[i][k] * other.get(k,j);
              }
          }
      }
      this.matriz = resultado.matriz;
      this.linhas = resultado.linhas;
      this.colunas = resultado.colunas;
  }
  public Matriz copiar(){
        double[][] novaMatriz = new double[linhas][colunas];
      for (int i = 0; i < linhas; i++) {
          novaMatriz[i] = Arrays.copyOf(matriz[i],colunas);
      }
      return new Matriz(linhas,colunas,novaMatriz);
  }
  @Override
   public String toString(){
        StringBuilder sb = new StringBuilder();
      for (int i = 0; i < linhas; i++) {
          sb.append(Arrays.toString(matriz[i])).append("\n");
      }
      return sb.toString();
  }
}
