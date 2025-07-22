package _16_publicaciones;

public abstract class Publicacion implements CanRead {
	private String titulo;
	private int numPags;
	private int pagActual;
	private boolean formatoDigital;
	private double precio;
	private int id;
	private boolean leido;
	private static int nextId = 1;

	public Publicacion(String titulo, int numPags, boolean formatoDigital, double precio) {
		this.titulo = titulo == null ? "Autor desconocido" : titulo;
		this.numPags = numPags <= 0 ? 1 : numPags;
		pagActual = 1;
		this.formatoDigital = formatoDigital;
		this.precio = precio <= 0 ? 1 : precio;
		id = nextId++;
	}

	@Override
	public String toString() {
		return String.format("\"%s\" con %d páginas y precio %.2f€. ", titulo, numPags, precio);
	}

	public void show() {
		System.out.printf(
				"Titulo: %s%nId: %d%nPáginas: %d%nPágina Actual: %d%n"
						+ "Precio: %.2f%nFormato digital: %s%nLeído: %s%n",
				titulo, id, numPags, pagActual, precio, formatoDigital ? "Sí" : "No", leido ? "Sí" : "No");
	}

	public static void showStatic(Publicacion p) {
		if (p == null) {
			System.out.printf("%n¡Lo siento! No tenemos esa publicación%n");
		} else {
			p.show();
		}
	}

	public int getNumPags() {
		return numPags;
	}

	public int getPagActual() {
		return pagActual;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getId() {
		return id;
	}


	public void leePagina(boolean silenciosamente) {
		if(silenciosamente) {
			if(leido) {
				finalizado();
				
			}else if(pagActual == numPags) {
				System.out.printf("Última página (%d) ", pagActual);
				paginaLeida();
				leido = true;
				
			}else {
				System.out.printf("%nPágina %d ", pagActual);
				paginaLeida();
				pagActual++;
			}
			
		}else {
			System.out.println("%nNo se leyó silenciosamente.%n");
		}


	}
	
	public abstract void finalizado();
	public abstract void paginaLeida();
	
	public static void leePaginaStatic(boolean silencionamente, Publicacion p) {
		p.leePagina(silencionamente);
	}
}
