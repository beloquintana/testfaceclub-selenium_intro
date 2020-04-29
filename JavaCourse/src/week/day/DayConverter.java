package week.day;

import java.util.Scanner;

public class DayConverter {
    public static void main(String arg[]){
        System.out.println("Ingrese el numero de la semana(1-7)");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero de la semana ingresado no es valido");
        }
    }
}
