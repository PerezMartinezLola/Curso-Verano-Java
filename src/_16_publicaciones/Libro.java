package _16_publicaciones;

public class Libro extends Publicacion{
	private String autor;
	private int pagInicial;
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	
	
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio);
		this.autor = autor == null ? "Autor desconocido" : autor;
		this.pagInicial = pagInicial;
		
	}
	

	public int getPagInicial() {
		return pagInicial;
	}


	@Override
	public String toString() {
		return "Libro " + super.toString() + "Autor: " + autor;
	}
	
	@Override
	public void show () {
		pagInicial = getPagActual();
		System.out.print(mensajeCabecera);
		super.show();
		System.out.printf("Autor: %s%nPágina Inicial: %d%n", autor, pagInicial);
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
	

	
	
	
	
	
	
	
	


