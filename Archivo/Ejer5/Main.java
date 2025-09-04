package Ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el valor que desee:");
        int valorUser = valor.nextInt();

        Entero num = new Entero(valorUser);


        System.out.println("El numero es: " + num.getNumero());
        System.out.println("El cuadrado del numero es: " + num.cuadrado());
        System.out.println("El numero es par?: " + num.esPar());
        System.out.println("El numero es impar?: " + num.esImpar());
        System.out.println("El factorial del numero es:" + num.factorial());
        System.out.println("El numero es primo?: " + num.esPrimo());

        valor.close();
    }

}
