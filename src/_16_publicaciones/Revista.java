package _16_publicaciones;

public class Revista extends Publicacion{
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
	

	public Revista(String titulo, int numPags, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio);
		
	}

	@Override
	public String toString() {
		return "Revista " + super.toString();
	}
	
	@Override
	public void show () {
		System.out.print(mensajeCabecera);
		super.show();
	}

	@Override
	public void finalizado() {
		System.out.printf("Revista titulada %s ya ha sido leída.%n", getTitulo());
		
	}

	@Override
	public void paginaLeida() {
		System.out.printf("leída de la revista titulada %s.%n", getTitulo());
		
	}
	
	
	
	
	
	

}
