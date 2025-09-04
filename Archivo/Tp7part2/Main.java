package Tp7part2;

public class Main {
    public static void main(String[] args) {
        try {
            Empleado e = new Empleado("Ana", 50000); // válido
            e.setLegajo(101); // válido
            System.out.println(e);

            e.setNombre("Al"); // inválido, lanza StringException
        } catch (StringException | EnteroPositivoException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}