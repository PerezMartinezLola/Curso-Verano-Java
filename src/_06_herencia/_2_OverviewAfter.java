package _06_herencia;

public class _2_OverviewAfter {
	public static void main(String[] args) {
		AnimalMejorado a1 = new AnimalMejorado(4.50);
		AnimalMejorado g1 = new GatoMejorado(6.50);
		AnimalMejorado p1 = new PerroMejorado(20);
		
		AnimalMejorado a2 = new AnimalMejorado(4.50);
		GatoMejorado g2 = new GatoMejorado(6.50);
		PerroMejorado p2 = new PerroMejorado(20);
		
		System.out.printf("Animales con herencia");
		System.out.printf("%n----------------------%n");
		a1.identificar();
		g1.identificar();
		p1.identificar();
		
		System.out.printf("%nPeso de Animales con herencia");
		System.out.printf("%n------------------------------%n");
		System.out.println(a1.getPeso());
		System.out.println(g1.getPeso());
		System.out.println(p1.getPeso());
		
	}
}
