package _05_herencia;

public class Animal {
	private long id;
	private double peso;
	private String color;
	private static long cantAnimales;
	private static long nextId = 1;
	
	
	
	public Animal(double peso, String color) {
		this.peso = peso;
		this.color = color;
//		Es lo mismo que this.id = Animal.nextId++;
		id = nextId++;
		cantAnimales++;
	}
	
	public void show () {
		System.out.printf("[ID:%d] Animal de peso %.2f kg y color %s.%n",id, peso, color);
	}
	
	public void show (Animal animal) {
		System.out.printf("[ID:%d] Animal de peso %.2f kg y color %s.%n",animal.id, 
						animal.peso, animal.color);
	}
	
	public static void describeClase (Animal animal) {
		System.out.printf("Clase Animal [ID: %d] peso %.2f kg, color %s. Cantidad total de animales: %d. [NextID: %d]%n",
							animal.id, animal.peso, animal.color, cantAnimales, Animal.nextId);
							
	}
	
	
	

}
