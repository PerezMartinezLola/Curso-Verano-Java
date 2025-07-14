package misfiguras;

public class Rectangulo extends Figura {
	private int base;
	private int altura;
	
	
	public Rectangulo() {
		this(2, 1, Color.NE);
	}
	
	public Rectangulo(double area, Color color) {
		super(color);
		area = area < 0 ? 1 : area;
		base = (int) area / 4;
		base = base < 1 ? 1 : base;  
		altura = base / 2;
		altura = altura < 1 ? 1 : altura;
	}
	
	public Rectangulo(int base, int altura, Color color) {
		super(color);
		this.base = base < 0 ? 1 : base;
		this.altura = altura < 0 ? 1 : altura;
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
