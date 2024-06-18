package RelacionamentoClasses;

import testes.Scanner;

public class CalcInterface {
private Scanner scanner;
public CalcInterface(){
    scanner = new Scanner(System.in);
}
public double recebeOperando(int i){
    System.out.print("digite o" + i + " operando: ");
    return scanner.nextDouble();
}
}
