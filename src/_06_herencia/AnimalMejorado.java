package _06_herencia;

public class AnimalMejorado {
	private double peso;
	
	public AnimalMejorado (double peso) {
		this.peso = peso;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	public void identificar() {
//		Puedo quitar el this de this.getClass()
		System.out.print("Soy un " + this.getClass().getSimpleName().toUpperCase());
	}
}
