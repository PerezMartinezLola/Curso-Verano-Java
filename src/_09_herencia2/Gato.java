package _09_herencia2;

public class Gato extends Animal{
	private boolean cascabel;

	public Gato(double peso, boolean cascabel) {
		super(peso);
		this.cascabel = cascabel;
	}
	
	
	@Override
	public void identificar () {
		System.out.print("Soy un gato");
	}
	
	@Override
	public void identificar2() {
		super.identificar2();
		System.out.print("gato.");
	}
	
	public boolean isCascabel() {
		return cascabel;
	}
	
	public void infoCascabel() {
		System.out.printf("El gato %s tiene cascabel%n", 
						cascabel ? "" : "no");
	}
}
