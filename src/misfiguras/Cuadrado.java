package misfiguras;

public class Cuadrado extends Figura{
	
	private int lado;

	public Cuadrado() {
		this(1, Color.NE);
	}
	
	public Cuadrado(double area, Color color) {
		super(color);
		area = area < 0 ? 1 : area;
		lado = (int) Math.sqrt(area);
	}
	
	public Cuadrado (int lado, Color color) {
		super(color);
		this.lado = lado < 0 ? 1 : lado;
	}
	
	
	@Override
	public double perimetro() {
		return 4 * lado;
	}
	
	@Override
	public double area () {
		return lado * lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado= " + lado + "," + super.toString() + "]";
	}

	
}
