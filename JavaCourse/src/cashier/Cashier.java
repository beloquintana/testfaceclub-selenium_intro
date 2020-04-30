package cashier;

import java.util.Scanner;

public class Cashier {
    public static void main(String arg[]){
        System.out.println("Entre el numero de productos");
        Scanner scanner = new Scanner(System.in);
        int productsQuantity = scanner.nextInt();

        double total = 0;
        for (int i=0;i<productsQuantity;i++){
            System.out.println("Entre el precio del producto:");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();

        System.out.println("El costo total de todos los productos es: " + total);
    }
}
