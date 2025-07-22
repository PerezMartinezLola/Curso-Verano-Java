package _10_misfiguras;

public class Cuadrado extends Figura{
	
	private int lado;

	public Cuadrado() {
		this(1, Color.NE);
	}
	
	public Cuadrado(double area, Color color) {
		super(color);
		area = valorMinimo((int) area);
		lado = valorMinimo((int) Math.sqrt(area));
	}
	
	public Cuadrado (int lado, Color color) {
		super(color);
		this.lado = valorMinimo(lado);
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
