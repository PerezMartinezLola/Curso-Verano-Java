package _08_herencia;

public class _1_OverviewPolimorphism {
	public static void main(String[] args) {
		
		AnimalMejorado a1 = new AnimalMejorado(5);
		AnimalMejorado a2 = new PerroMejorado(25);
		AnimalMejorado a3 = new GatoMejorado(10);
		AnimalMejorado a4 = new PerroMejorado(30);
		AnimalMejorado a5 = new OsoMejorado(800);
		OsoMejorado a6 = new OsoMejorado(1_000);
		
		System.out.printf("Animal a1 con herencia");
		System.out.printf("%n----------------------%n");
		a1.identificar();
		System.out.println(" y peso " + a1.getPeso() + " Kg.");
		
		System.out.printf("%nAnimal a2 con herencia");
		System.out.printf("%n----------------------%n");
		a2.identificar();
		System.out.println(" y peso " + a2.getPeso() + " Kg.");
		
		System.out.printf("%nAnimal a3 con herencia");
		System.out.printf("%n----------------------%n");
		a3.identificar();
		System.out.println(" y peso " + a3.getPeso() + " Kg.");
		
		System.out.printf("%nAnimal a4 con herencia");
		System.out.printf("%n----------------------%n");
		a4.identificar();
		System.out.println(" y peso " + a4.getPeso() + " Kg.");
		
		System.out.printf("%nAnimal a5 con herencia");
		System.out.printf("%n----------------------%n");
		a5.identificar();
		System.out.println(" y peso " + a4.getPeso() + " Kg.");
		if(a5 instanceof OsoMejorado) {
			((OsoMejorado) a5).rugir(5);
		}
		
		System.out.printf("%nAnimal a6 con herencia");
		System.out.printf("%n----------------------%n");
		a6.identificar();
		System.out.println(" y peso " + a6.getPeso() + " Kg.");
		a6.rugir(4);
		
		
		
	}
}
