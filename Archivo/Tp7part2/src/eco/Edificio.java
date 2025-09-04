package Tp7part2.src.eco;

public class Edificio implements ImpactoEcologico {
	private double consumoKwh;

	public Edificio(double consumo) {
	this.consumoKwh = consumo;
	}

	public double obtenerImpactoEcologico() {
	return consumoKwh * 0.5;
	}

	public String toString() {
	return "Edificio - Consumo eléctrico: " + consumoKwh + " kWh";
	}

}