package _16_publicaciones;

public class Libro extends Publicacion{
	private String autor;
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	
	
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor == null ? "Autor desconocido" : autor;	
	}
	

	@Override
	public String toString() {
		return "Libro " + super.toString() + "Autor: " + autor;
	}
	
	@Override
	public void show () {
		System.out.print(mensajeCabecera);
		super.show();
		System.out.printf("Autor: %s%nPágina Inicial: %d%n", autor, getPagInicial());
	}
	
	@Override
	public void finalizado() {
		System.out.printf("Libro titulado %s del autor %s ya ha sido leído.%n", getTitulo(), autor);
	}


	@Override
	public void paginaLeida() {
		System.out.printf("leída del libro titulado %s del autor %s.%n", getTitulo(),	autor);
	}
	

}
	

	
	
	
	
	
	
	
	


