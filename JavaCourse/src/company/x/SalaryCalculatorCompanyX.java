package company.x;

import java.util.Scanner;

public class SalaryCalculatorCompanyX {
    public static void main(String arg[]){
        int weekSalary = 1000;
        int salesCount = 10;
        int bonus = 150;

        System.out.println("Entre la cantidad de ventas realizadas en la semana");
        Scanner scanner = new Scanner(System.in);
        int salesWeek = scanner.nextInt();
        scanner.close();

        if(salesWeek > salesCount){
            weekSalary = weekSalary + bonus;
        }

        System.out.println("El salario mensual del empleado es de $" + weekSalary);
    }

}
