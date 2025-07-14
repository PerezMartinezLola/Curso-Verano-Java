package misfiguras;

public abstract class Figura {
	private Color color;
	
	
	public Figura(Color color) {
		if(color == null) {
			this.color = Color.NE;
		}else {
			this.color = Color.colorValido(color);
		}
	}

	public abstract double perimetro();
	
	public abstract double area ();
	
	public boolean compararAreas(Figura f2) {
		return this.area() == f2.area();
	}

	@Override
	public String toString() {
		return " color= " + color.getColor();
	}
	
	
}
