package _10_misfiguras;

public abstract class Figura {
	private Color color;
	
	
	public Figura(Color color) {
		this.color = Color.colorValido(color);		
	}

	public abstract double perimetro();
	
	public abstract double area ();
	
	public boolean compararAreas(Figura f) {
		return f != null && this.area() == f.area();
	}
	
	public static int valorMinimo(int valor) {
	    return valor < 1 ? 1 : valor;
	}
	
	@Override
	public String toString() {
		return " color= " + color.getColor() + "," + String.format(" perimetro= %.3f", perimetro()) + 
				"," + String.format(" area= %.3f", area());
	}
	
	
}
