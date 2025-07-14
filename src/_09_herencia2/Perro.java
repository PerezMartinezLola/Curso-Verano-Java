package _09_herencia2;

public class Perro extends Animal {
	
	public Perro (double peso) {
		super(peso);
	}
	
//	El método sobreescribe al del animal
	
	@Override
	public void identificar () {
		System.out.printf("Soy un perro");
	}

	@Override
	public void identificar2() {
		super.identificar2();
		System.out.print("perro.");
	}
	
	
}
