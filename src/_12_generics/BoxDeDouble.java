package _12_generics;

public class BoxDeDouble {
	private Double contenido;

	public BoxDeDouble(Double contenido) {
		this.contenido = contenido;
	}
	
	public boolean isPresent () {
		return this.contenido != null;
	}

	@Override
	public String toString() {
		return "BoxDeDouble [contenido= " + contenido + "]";
	}
	
	
	

}
