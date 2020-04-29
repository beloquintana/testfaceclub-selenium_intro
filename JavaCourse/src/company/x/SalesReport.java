package company.x;

import java.util.Scanner;

public class SalesReport {
    public static void main(String arg[]){
        int salesWeekBase = 5;

        System.out.println("Entre la cantidad de ventas realizadas en la semana");
        Scanner scanner = new Scanner(System.in);
        int salesWeek = scanner.nextInt();
        scanner.close();

        if(salesWeek >= salesWeekBase){
            System.out.println("Felicidades! Usted ha alcanzado el numero de ventas semanales");
        }else{
            int salesMissing = salesWeekBase - salesWeek;
            System.out.println("Usted no cumplio con las ventas semanales. Le faltaron " + salesMissing + " ventas");
        }
    }
}
