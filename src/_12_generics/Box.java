package _12_generics;

public class Box <T> {
	private T t;

	public Box(T t) {
		this.t = t;
	}
	
	public boolean isPresent () {
		return this.t != null;
	}

	@Override
	public String toString() {
		return "Box [contenido= " + t + "]";
	}
	
	

}
