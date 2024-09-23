package RelacionamentoClasses;

import java.util.Scanner;

public class CalcInterface {
private Scanner scanner;
public CalcInterface(){
    scanner = new Scanner(System.in);
}
public double recebeOperando(int i){
    System.out.print("digite o" + i + " operando: ");
    return scanner.nextDouble();
}
public char recebeOperacao(){
    System.out.println("Digite a operação(+,-,*,/ ou 's' para sair");
    return scanner.next().charAt(0);
    }
public void mostrarResultado(double res){
    System.out.println("Resultado: " + res);
   }
}
