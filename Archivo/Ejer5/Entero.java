package Ejer5;

public class Entero {
    private int numero;
    //constructor de la clase Enteros
    public Entero(int numero){
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //calcula el cuadrado de n
    public long cuadrado(){
        return (long) numero*numero;
    }

    public boolean esPar(){
        if (numero % 2 == 0) {
            return true;
        } else return false;
    }
    public boolean esImpar(){
        if (numero % 2 != 0) {
            return true;
        } else return false;
    }
    public long factorial(){
        if(numero < 0){
            throw new Error("No se puede calcular valores negativos");
        }
        long fact = 1;
        for(int i = 2; i <= numero; i++){
            fact *= i;
        }
        return fact;
    }

    public boolean esPrimo(){
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero / i == 0) {
                return false;
            }
        }
        return true;
    }

}

