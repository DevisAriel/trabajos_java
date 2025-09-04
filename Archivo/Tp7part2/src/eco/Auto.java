package Tp7part2.src.eco;

public class Auto  implements ImpactoEcologico {
	private double litrosCombustible;
	
	public Auto(double litros) {
		this.litrosCombustible = litros;
	}
	
	public double obtenerImpactoEcologico() {
		return litrosCombustible * 2.3;
	}
	
	public String toString() {
		return "Auto - Combustible usado: " + litrosCombustible + " litros";
	}
}