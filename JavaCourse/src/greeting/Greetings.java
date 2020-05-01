package greeting;

import java.util.Scanner;

public class Greetings {
    public static void main(String arg[]){
        System.out.println("Entre su nombre:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hola " + name);
    }
}
