package _08_herencia;

public class Gato {
	private double peso;
	
	
	public Gato () {
		
	}
	
	public Gato (double peso) {
		this.peso = peso;
	}
	

	public double getPeso() {
		return peso;
	}


	public void identificar () {
		System.out.printf("Soy un GATO de peso %.2f kg.%n", peso);
	}
}
