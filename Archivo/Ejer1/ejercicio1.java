package Ejer1;
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        int num3 = scanner.nextInt();

        int resultado;
        if (num1 >= 0) {
            resultado = num2 * num3;
        }else {
            resultado = num2 + num3;
        }

        System.out.println("El resultado es: " + resultado);
        
        scanner.close();
    }
    
}
