package Ejer2;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación");
        int cal = scanner.nextInt();
        
        if (cal >= 0 && cal < 4){
             System.err.println("La nota del Alumno es un Desaprobado");
        }else{
            if (cal >= 4 && cal < 6 ) {
                 System.err.println("La nota del Alumno es un Desaprobado, Regular");
            }else{
                if (cal >= 6 && cal < 8 ) {
                    System.err.println("La nota del Alumno es un Aprobado, Bien");
                }else{
                    if (cal >= 8 && cal <= 10 ) {
                    System.err.println("La nota del Alumno es un Aprobado, Excelente");
                    }
                }
            }
        }

        scanner.close();
    }
}



