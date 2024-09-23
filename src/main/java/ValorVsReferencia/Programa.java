package ValorVsReferencia;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner Scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
     //   product.name = Scanner.nextLine();
        System.out.print("Price: ");
     //   product.price = Scanner.nextDouble();
        System.out.println("quantiny in stok: ");
      //  product.quantiny = Scanner.nextInt();

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in sotck: ");
        int quantiny = Scanner.nextInt();
      //  product.addProducts(quantiny);

        System.out.println();
        System.out.println("Updated data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in sotck: ");
        quantiny= Scanner.nextInt();
     //   product.removeProducts(quantiny);
//
        System.out.println();
        System.out.println("Updated data:" + product);


        Scanner.close();
    }
}
