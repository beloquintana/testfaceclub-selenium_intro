package calculator;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String arg[]){
        //Obtener el número 1
        System.out.println("Entre el numero 1");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        //Obtener el número 2
        System.out.println("Entre el numero2");
        double number2 = scanner.nextDouble();
        scanner.close();

        //Sumar los dos números
        double sum = number1 + number2;

        //Restar los dos números
        double subtract = number1 - number2;

        //Mostrar el resultado de la suma
        System.out.println("El resultado de la suma es " + sum);

        //Mostrar el resultado de la resta
        System.out.println("El resultado de la resta es " + subtract);

    }


}
