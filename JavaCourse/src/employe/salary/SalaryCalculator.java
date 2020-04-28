package employe.salary;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
        //Obtener el nombre del empleado
        System.out.println("Entre el nombre del empleado");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Obtener la cantidad de horas trabajadas en el mes
        System.out.println("Entre el numero de horas que trabajo en el mes");
        double hoursWorked = scanner.nextDouble();

        //Obtener el valor hora del empleado
        System.out.println("Entre el valor hora al mes");
        double payRate = scanner.nextDouble();
        scanner.close();

        //Multiplicar cantidad de horas trabajadas * valor hora
        double monthSalary = hoursWorked * payRate;

        //Mostrar el salario mensual del empleado
        System.out.println("El salario mensual del empleado " + name + " es de $" + monthSalary);
    }
}
