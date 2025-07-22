package _12_generics;

public class BoxDeString {
	private String contenido;

	public BoxDeString(String contenido) {
		this.contenido = contenido;
	}
	
	public boolean isPresent () {
		return this.contenido != null;
	}

	@Override
	public String toString() {
		return "BoxDeString [contenido= " + contenido + "]";
	}
	
	

}
