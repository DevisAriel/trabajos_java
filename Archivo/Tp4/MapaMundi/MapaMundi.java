package Tp4.MapaMundi;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

class Provincia {
    private String nombre;
    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Pais {
    private String nombre;
    private String capital;
    private double superficie;
    private List<Provincia> provincias;
    Set<Pais> paisesLimitrofes;

    public Pais(String nombre, String capital, double superficie) {
        this.nombre = nombre;
        this.capital = capital;
        this.superficie = superficie;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new HashSet<>();
    }
    
    // Constructor corregido para vincular a un Continente
    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new HashSet<>();
        continente.agregarPais(this);
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void agregarLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

    public Set<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }
}

class Continente {
    private String nombre;
    private List<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public String getNombre() {
        return nombre;
    }
}

public class MapaMundi {
    private final Set<Continente> continentes;
    private final Set<Pais> paises;
    private final Set<Provincia> provincias;

    public MapaMundi() {
        this.continentes = new HashSet<>();
        this.paises = new HashSet<>();
        this.provincias = new HashSet<>();
        inicializarDatos();
        inicializarLimitrofes();
    }

    private void inicializarDatos() {
        Continente america = new Continente("América");
        Continente europa = new Continente("Europa");
        Continente asia = new Continente("Asia");
        Continente africa = new Continente("África");
        Continente oceania = new Continente("Oceanía");
        Continente antartida = new Continente("Antártida");

        continentes.add(america);
        continentes.add(europa);
        continentes.add(asia);
        continentes.add(africa);
        continentes.add(oceania);
        continentes.add(antartida);

        Pais argentina = new Pais("Argentina", america);
        Pais uruguay = new Pais("Uruguay", america);
        Pais brasil = new Pais("Brasil", america);
        Pais chile = new Pais("Chile", america);
        Pais paraguay = new Pais("Paraguay", america);
        Pais bolivia = new Pais("Bolivia", america);
        Pais espana = new Pais("España", europa);
        Pais francia = new Pais("Francia", europa);
        Pais italia = new Pais("Italia", europa);
        Pais portugal = new Pais("Portugal", europa);

        paises.add(argentina);
        paises.add(uruguay);
        paises.add(brasil);
        paises.add(chile);
        paises.add(paraguay);
        paises.add(bolivia);
        paises.add(espana);
        paises.add(francia);
        paises.add(italia);
        paises.add(portugal);

        provincias.add(new Provincia("Entre Ríos", argentina));
        provincias.add(new Provincia("Buenos Aires", argentina));
        provincias.add(new Provincia("Santa Fé", argentina));
        provincias.add(new Provincia("Corrientes", argentina));
        provincias.add(new Provincia("Córdoba", argentina));
        provincias.add(new Provincia("Salto", uruguay));
        provincias.add(new Provincia("Paysandú", uruguay));
        provincias.add(new Provincia("Canelones", uruguay));
        provincias.add(new Provincia("Rocha", uruguay));
        provincias.add(new Provincia("Maldonado", uruguay));
    }

    private void inicializarLimitrofes() {
        Pais argentina = getPaisPorNombre("Argentina");
        Pais uruguay = getPaisPorNombre("Uruguay");
        Pais brasil = getPaisPorNombre("Brasil");
        Pais chile = getPaisPorNombre("Chile");
        Pais paraguay = getPaisPorNombre("Paraguay");
        Pais bolivia = getPaisPorNombre("Bolivia");
        Pais espana = getPaisPorNombre("España");
        Pais francia = getPaisPorNombre("Francia");
        Pais italia = getPaisPorNombre("Italia");
        Pais portugal = getPaisPorNombre("Portugal");

        if (argentina != null) {
            argentina.agregarLimitrofe(uruguay);
            argentina.agregarLimitrofe(brasil);
            argentina.agregarLimitrofe(chile);
            argentina.agregarLimitrofe(paraguay);
            argentina.agregarLimitrofe(bolivia);
        }
        if (uruguay != null) {
            uruguay.agregarLimitrofe(argentina);
            uruguay.agregarLimitrofe(brasil);
        }
        if (brasil != null) {
            brasil.agregarLimitrofe(argentina);
            brasil.agregarLimitrofe(uruguay);
            brasil.agregarLimitrofe(paraguay);
            brasil.agregarLimitrofe(bolivia);
        }
        if (chile != null) {
            chile.agregarLimitrofe(argentina);
            chile.agregarLimitrofe(bolivia);
        }
        if (paraguay != null) {
            paraguay.agregarLimitrofe(argentina);
            paraguay.agregarLimitrofe(brasil);
            paraguay.agregarLimitrofe(bolivia);
        }
        if (bolivia != null) {
            bolivia.agregarLimitrofe(argentina);
            bolivia.agregarLimitrofe(brasil);
            bolivia.agregarLimitrofe(paraguay);
            bolivia.agregarLimitrofe(chile);
        }
        if (espana != null) {
            espana.agregarLimitrofe(francia);
            espana.agregarLimitrofe(portugal);
        }
        if (francia != null) {
            francia.agregarLimitrofe(espana);
            francia.agregarLimitrofe(italia);
        }
        if (italia != null) {
            italia.agregarLimitrofe(francia);
        }
        if (portugal != null) {
            portugal.agregarLimitrofe(espana);
        }
    }

    // Método corregido para buscar y devolver un País
    private Pais getPaisPorNombre(String nombre) {
        for (Pais pais : paises) {
            if (pais.getNombre().equalsIgnoreCase(nombre)) {
                return pais;
            }
        }
        return null;
    }

    public Set<Pais> getPaises(String nombreContinente) {
        for (Continente continente : continentes) {
            if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
                return new HashSet<>(continente.getPaises());
            }
        }
        return new HashSet<>();
    }
    
    public Set<Provincia> getProvincias(String nombrePais) {
        Pais pais = getPaisPorNombre(nombrePais);
        if (pais != null) {
            return new HashSet<>(pais.getProvincias());
        }
        return new HashSet<>();
    }

    public Set<Pais> getLimitrofes(String nombrePais) {
        Pais pais = getPaisPorNombre(nombrePais);
        if (pais != null) {
            return pais.getPaisesLimitrofes();
        }
        return new HashSet<>(); 
    }
}
