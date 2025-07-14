package _09_herencia2;

public class Test {
	public static void main(String[] args) {
//		Animal a = new Animal(10);
		Perro p = new Perro(20.5);
		Gato g = new Gato(8.2, true);
		boolean paraProbar = g instanceof Gato;
		
		//Esto da error porque el animal solo tiene object y animal pero no gato
//		Gato ag = (Gato)a;
		
		Animal ag1 = g;
		
		Animal ag = g;
		Animal ap = p;
		
		Gato agg = (Gato) ag;
//		Da error porque perro esta apuntando a un gato
//		Perro agp = (Perro) ag;
		
		Animal [] animales = { new Perro(3), new Gato(5, true), new Gato(6, false)};
		
		for (Animal animal : animales) {
			animal.identificar();
			System.out.print(" " +"de "  + animal.getPeso() + " kg. ");
			animal.identificar2();
			animal.identificar3();
			System.out.println();
			if(animal instanceof Gato) {
				((Gato)animal).infoCascabel();
			}
		}
		
		
	}
}
