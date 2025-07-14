package misfiguras;

public abstract class Figura {
	private Color color;
	
	
	public Figura(Color color) {
		this.color = color == null ? Color.NE : color;		
	}
	

	public abstract double perimetro();
	
	public abstract double area ();
	
	public boolean compararAreas(Figura f) {
		return this.area() == f.area();
	}

	@Override
	public String toString() {
		return " color= " + color.getColor();
	}
	
	
}
