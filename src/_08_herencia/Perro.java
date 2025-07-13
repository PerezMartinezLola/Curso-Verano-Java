package _08_herencia;

public class Perro {
	private double peso;
	
	
	public Perro (double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void identificar () {
		System.out.printf("Soy un PERRO de peso %.2f kg.%n", peso);
	}
}
