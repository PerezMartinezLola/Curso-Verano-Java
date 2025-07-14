package misfiguras;

public class Circulo extends Figura {
	private int radio;
	private static final double PI = 3.1416;
	
	
	public Circulo () {
		this(1, Color.NE);
	}
	
	public Circulo (double area, Color color) {
		super(color);
		area = area < 0 ? 1 : area;
		radio = (int) Math.sqrt(area/ PI);
		radio = radio < 1 ? 1 : radio;
	}
	
	public Circulo (int radio, Color color) {
		super(color);
		this.radio = radio < 0 ? 1 : radio;
	}

	
	@Override
	public double perimetro() {
		return 2 * PI * radio;
	}

	@Override
	public double area() {
		return PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio= " + radio + "]";
	}

}
