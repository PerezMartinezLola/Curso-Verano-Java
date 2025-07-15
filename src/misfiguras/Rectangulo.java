package misfiguras;

public class Rectangulo extends Figura {
	private int base;
	private int altura;
	
	
	public Rectangulo() {
		this(2, 1, Color.NE);
	}
	
	public Rectangulo(double area, Color color) {
		super(color);
		area = valorMinimo((int) area);
//		base = (int) Math.sqrt(area * 2); 
		altura = valorMinimo((int) Math.sqrt(area / 2));
		base = 2* altura;
	}
	
	public Rectangulo(int base, int altura, Color color) {
		super(color);
		this.base = valorMinimo(base);
		this.altura = valorMinimo(altura);
	}


	@Override
	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base= " + base + ", altura= " + altura + "," + super.toString() + "]";
		
	}

	
}
