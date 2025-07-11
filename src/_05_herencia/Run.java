package _05_herencia;

public class Run {
	public static void main(String[] args) {
		Animal a1 = new Animal(3.55, "blanco");
		Animal a2 = new Animal(15.4, "marrón");
		Animal a3 = new Animal(8, "canela");
		a1.show();
		Animal.describeClase(a1);
		Animal.describeClase(a2);
		Animal.describeClase(a3);
	}
}
