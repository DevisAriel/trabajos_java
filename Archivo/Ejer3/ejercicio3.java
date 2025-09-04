package Ejer3;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        
        String palabra = scanner.nextLine();

        String palabrainvetida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(palabrainvetida)){
            System.out.println("La palabra es un palindromo");

        }else{
            System.out.println("La palabra no es un palindromo");
        }

        scanner.close();
    }
}
