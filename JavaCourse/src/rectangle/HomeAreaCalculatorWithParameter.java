package rectangle;

import java.util.Scanner;

public class HomeAreaCalculatorWithParameter {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        Rectangle room1 = getRectangle();
        Rectangle room2 = getRectangle();

        double totalArea = getTotalArea(room1, room2);
        scanner.close();
        System.out.println("El area total de los dos cuartos es de " + totalArea);
    }

    public static Rectangle getRectangle(){
        System.out.println("Entre el largo del rectangulo");
        double length = scanner.nextDouble();

        System.out.println("Entre el ancho del rectangulo");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public static double getTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
