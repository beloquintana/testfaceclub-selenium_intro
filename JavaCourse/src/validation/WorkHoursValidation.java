package validation;

import java.util.Scanner;

public class WorkHoursValidation {
    public static void main(String arg[]){
        int maxHours = 40;
        int minHours = 1;

        System.out.println("Entre la cantidad de horas trabajadas en la semana");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        while(hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("La cantidad de horas trabajadas en la semana debe estar entre "+ minHours + " y " + maxHours + " horas");
            hoursWorked = scanner.nextInt();
        }

        System.out.println("Ha ingresado "+ hoursWorked + " horas");
    }
}
