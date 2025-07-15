package misfiguras;

public class Circulo extends Figura {
	private int radio;
//	private static final double PI = 3.1416;
	
	
	public Circulo () {
		this(1, Color.NE);
	}
	
	public Circulo (double area, Color color) {
		super(color);
		area = valorMinimo((int) area);
		radio = valorMinimo((int) Math.sqrt(area/ Math.PI));
	}
	
	public Circulo (int radio, Color color) {
		super(color);
		this.radio = valorMinimo(radio);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio= " + radio +	"," + super.toString() + "]";
	}

}
