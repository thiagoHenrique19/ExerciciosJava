package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double nota1;
          double nota2;
          double nota3;

        System.out.println("Me informe a primeira nota. ");
        nota1 = scanner.nextInt();

        System.out.println("E agora a segunda nota. ");
        nota2 = scanner.nextInt();

        System.out.println("E a  terceira nota. ");
        nota3 = scanner.nextInt();

        double calculo1 = nota1 + nota2 + nota3;

        double calculo2 = calculo1 / 3 ;

if(calculo2 > 6){
    System.out.println("Aprovado. ");
}else{
    System.out.println("Reprovado. ");
}
        System.out.println("Sua media final é de:" + calculo2 );
    }
}
