package _08_herencia;

public class _1_OverviewBefore {
	public static void main(String[] args) {
		Animal a1 = new Animal(4.50);
		Gato g1 = new Gato(6.50);
		Perro p1 = new Perro(20);
		
		System.out.printf("Animales sin herencia");
		System.out.printf("%n----------------------%n");
		a1.identificar();
		g1.identificar();
		p1.identificar();
		
		System.out.printf("%nPeso de Animales sin herencia");
		System.out.printf("%n------------------------------%n");
		System.out.println(a1.getPeso());
		System.out.println(g1.getPeso());
		System.out.println(p1.getPeso());
		
	}
}
