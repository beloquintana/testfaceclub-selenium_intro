package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]){
        //Obtener el número 1
        System.out.println("Entre el numero 1");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        //Obtener el número 2
        System.out.println("Entre el numero2");
        int number2 = scanner.nextInt();
        scanner.close();

        //Sumar los dos números
        int sum = number1 + number2;

        //Restar los dos números
        int subtract = number1 - number2;

        //Multiplicar los dos números
        int multiplication = number1 * number2;

        //Dividir los dos números
        try {
            int div = number1 / number2;
            //Mostrar el resultado de la division
            System.out.println("El resultado de la division es " + div);
        }catch (Exception e){
            System.out.println("La division por cero no esta permitida");
        }

        //Mostrar el resultado de la suma
        System.out.println("El resultado de la suma es " + sum);

        //Mostrar el resultado de la resta
        System.out.println("El resultado de la resta es " + subtract);

        //Mostrar el resultado de la multiplicacion
        System.out.println("El resultado de la multiplicacion es " + multiplication);
    }
}
