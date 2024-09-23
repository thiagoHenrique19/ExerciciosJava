package MetodosEstaticos;

import java.util.Scanner;

import java.util.Locale;

public class MetodosEsta1 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double radius;

        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value : %.2f%n", Calculator.PI);

    }

}

