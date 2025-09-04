package Tp7part2.src.eco;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

objetos.add(new Auto(40));
objetos.add(new Edificio(800));
objetos.add(new Bicicleta());

for (ImpactoEcologico obj : objetos) {
System.out.println(obj.toString());
System.out.println("Impacto ecológico: " + obj.obtenerImpactoEcologico() + " kg CO₂");
}
}
}