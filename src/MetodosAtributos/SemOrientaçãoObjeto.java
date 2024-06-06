package MetodosAtributos;

import java.util.Scanner;

public class SemOrientaçãoObjeto {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double xA;
        double xB;
        double xC;
        double yA;
        double yB;
        double yC;

        System.out.println("Qual sao as medidas do triangulo X: ");
        xA = Scanner.nextDouble();
        xB = Scanner.nextDouble();
        xC = Scanner.nextDouble();

        System.out.println("Qual sao as medidas do triangulo Y: ");
        yA = Scanner.nextDouble();
        yB = Scanner.nextDouble();
        yC = Scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));

        System.out.println("Triangulo X area : " + areaX);
        System.out.println("Triangulo Y area : " + areaY);

        if(areaX > areaY){
            System.out.println("O triangulo X é mais largo");
        }else{
            System.out.println("O triangulo Y é mais largo");
        }

    }
}
