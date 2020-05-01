package strings.examples;

public class StringExample {
    public static void main(String arg[]){
        String name = "Juan";
        System.out.println("Juan length: " + name.length());

        String colors = "amarillo, rojo, azul";
        String[] colorsArray = colors.split(",");
        System.out.println("String split. Primer elemento de colorsArray: " + colorsArray[0]);

        if(name.equals(colors))
            System.out.println("Las variables name y colores son iguales");
        else
            System.out.println("Las variables name y colores son diferentes");

        if(colors.contains("azul"))
            System.out.println("Las variables colors contiene el color azul");
    }
}
