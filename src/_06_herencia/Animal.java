package _06_herencia;

public class Animal {
	private double peso;
	
	public Animal () {
		
	}
	public Animal (double peso) {
		this.peso = peso;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	public void identificar() {
		System.out.printf("Soy un ANIMAL de peso %.2f kg.%n", peso);
	}
}
