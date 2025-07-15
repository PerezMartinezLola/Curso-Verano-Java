package _10_misfigurasJavi;

public class Cuadrado {
	private int lado;
	
	
	public Cuadrado () {
		lado = 1;
	}
	
	public Cuadrado (double area) {
		lado = (int) Math.sqrt(area);
	}
	
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	
	public int perimetro() {
		return 4 * lado;
	}
}
