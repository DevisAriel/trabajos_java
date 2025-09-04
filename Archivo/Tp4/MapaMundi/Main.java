package Tp4.MapaMundi;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Instancia la clase principal
        MapaMundi mapa = new MapaMundi();

        System.out.println("--- PRUEBA DE PAÍSES LIMÍTROFES ---");
        // Obtiene y muestra los países limítrofes de Argentina
        System.out.println("Países limítrofes de Argentina:");
        Set<Pais> limitrofesArgentina = mapa.getLimitrofes("Argentina");
        limitrofesArgentina.forEach(pais -> System.out.println("- " + pais.getNombre()));

        // Obtiene y muestra los países limítrofes de España
        System.out.println("\nPaíses limítrofes de España:");
        Set<Pais> limitrofesEspana = mapa.getLimitrofes("España");
        limitrofesEspana.forEach(pais -> System.out.println("- " + pais.getNombre()));

        System.out.println("\n--- PRUEBA DE PROVINCIAS ---");
        // Obtiene y muestra las provincias de Argentina
        System.out.println("Provincias de Argentina:");
        Set<Provincia> provinciasArgentina = mapa.getProvincias("Argentina");
        provinciasArgentina.forEach(provincia -> System.out.println("- " + provincia.getNombre()));

        System.out.println("\n--- PRUEBA DE PAÍSES POR CONTINENTE ---");
        // Obtiene y muestra los países de América
        System.out.println("Países en América:");
        Set<Pais> paisesAmerica = mapa.getPaises("América");
        paisesAmerica.forEach(pais -> System.out.println("- " + pais.getNombre()));
    }
}
