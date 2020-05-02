package rectangle;

public class HomeAreaCalculator {
    public static void main(String arg[]){
        Rectangle room1 = new Rectangle();
        room1.setLength(5);
        room1.setWidth(2);
        double room1Area = room1.calculateArea();

        Rectangle room2 = new Rectangle(5,5);
        double room2Area = room2.calculateArea();

        double totalArea = room1Area + room2Area;

        System.out.println("El area de los dos cuartos es de: " + totalArea);
    }
}
