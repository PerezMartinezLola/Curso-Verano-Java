package _02_objetos;

public class PostIt {
	private String color;
	private String msg;
	private int alto;
	private int ancho;
	
	
	public PostIt(String color, String msg, int alto, int ancho) {
		this.color = color;
		this.msg = msg;
		this.alto = alto;
		this.ancho = ancho;
	}
	
	
	public PostIt (int lado) {
		this.ancho = lado;
		this.alto = lado;
		this.color = "amarillo";
		this.msg = "";
	}
	

	public boolean cambiaAlto (int nuevoAlto) {
		boolean resultadoOk = nuevoAlto >= 1;
		if(resultadoOk) {
			alto = nuevoAlto;
		}
		return resultadoOk;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public String toString() {
		return "PostIt [color=" + color + ", msg=" + msg + ", alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	public static void main(String[] args) {
		PostIt p1 = new PostIt("rosa", "AA", 50, 50);
		PostIt p2 = new PostIt("amarillo", "BB", 50, 50);
		PostIt p3 = new PostIt("naranja", "CC", 30, 30);
		PostIt p4 = new PostIt("azul", "DD", 30, 30);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	
}
	
}
