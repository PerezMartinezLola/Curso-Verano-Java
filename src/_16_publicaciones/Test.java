package _16_publicaciones;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Test {

	public static void subrayado(String enunciado) {
		System.out.printf("%s%n%s%n", "\033[36m", enunciado.toUpperCase());
		System.out.printf("-".repeat(enunciado.length()));
		System.out.print("\033[37m");
		System.out.println();
	}

	private static void listaTitID(Publicacion[] publicaciones) {
		for (int i = 0; i < publicaciones.length; i++) {
			System.out.printf("%s [%d]: %s%n",publicaciones[i].getClass().getSimpleName(),
					publicaciones[i].getId(), publicaciones[i].getTitulo());
		}
	}

	private static void tituloIdFiltrando(Publicacion[] publicaciones, Class <? extends Publicacion> clase) {
		for (int i = 0; i < publicaciones.length; i++) {
			if(clase.isInstance(publicaciones[i])) {
				System.out.printf("%s [%d]: %s %n", clase.getSimpleName() , publicaciones[i].getId(), 
						          publicaciones[i].getTitulo());
			}
		}
	}
	
	private static void tituloIdPrecio(Publicacion [] publicaciones) {
		for (int i = 0; i < publicaciones.length; i++) {
			if(publicaciones[i].getPrecio() > 20) {
				System.out.printf("%s [%d]: %s - %.2f€%n", publicaciones[i].getClass().getSimpleName() , 
								 publicaciones[i].getId(), publicaciones[i].getTitulo(),
								 publicaciones[i].getPrecio());
			}
		}
	}
	private static void tituloIdFiltradoPrecioMayor(Publicacion [] publicaciones, Class <?> clase, double precio) {
		for (int i = 0; i < publicaciones.length; i++) {
			if(clase.isInstance(publicaciones[i]) && publicaciones[i].getPrecio() > precio) {
				System.out.printf("%s [%d]: %s - %.2f€%n", publicaciones[i].getClass().getSimpleName() , 
						 publicaciones[i].getId(), publicaciones[i].getTitulo(),
						 publicaciones[i].getPrecio());
			}
		}
			
	}
	public static void main(String[] args) {

		Libro[] libros = new Libro[10];

		libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		libros[1] = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		libros[2] = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		libros[3] = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		libros[4] = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		libros[5] = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		libros[6] = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		libros[7] = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		libros[8] = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		libros[9] = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		subrayado("-array libros-");
		for (int i = 0; i < libros.length; i++) {
			System.out.println("lib" + i + " → " + libros[i]);
		}

		Revista[] revistas = new Revista[5];

		revistas[0] = new Revista("Muy interesante", 127, false, 24.99);
		revistas[1] = new Revista("National Geographic", 150, false, 35.60);
		revistas[2] = new Revista("CuerpoMente", 130, false, 19.99);
		revistas[3] = new Revista("Mongolia", 90, false, 8.99);
		revistas[4] = new Revista("Historia NG", 132, false, 31.99);

		subrayado("-array revistas-");
		for (int i = 0; i < revistas.length; i++) {
			System.out.println("rev" + i + " → " + revistas[i]);
		}

		Publicacion[] publicaciones = new Publicacion[15];

		publicaciones[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		publicaciones[1] = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		publicaciones[2] = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		publicaciones[3] = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		publicaciones[4] = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		publicaciones[5] = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		publicaciones[6] = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		publicaciones[7] = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		publicaciones[8] = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		publicaciones[9] = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		publicaciones[10] = new Revista("Muy interesante", 127, false, 24.99);
		publicaciones[11] = new Revista("National Geographic", 150, false, 35.60);
		publicaciones[12] = new Revista("CuerpoMente", 130, false, 19.99);
		publicaciones[13] = new Revista("Mongolia", 90, false, 8.99);
		publicaciones[14] = new Revista("Historia NG", 132, false, 31.99);

		subrayado("-array de libros y revistas-");
		for (int i = 0; i < publicaciones.length; i++) {
			System.out.printf("%s%n", publicaciones[i]);

		}

		subrayado("a. Todas las publicaciones del array publicaciones con título y ID.");
		listaTitID(publicaciones);

		subrayado("b. Solo libros del array publicaciones con ID y título.");
		tituloIdFiltrando(publicaciones, Libro.class);
		
		subrayado("c. Solo revistas del array publicaciones con ID y título (usar instanceof para discriminar).");
		tituloIdFiltrando(publicaciones, Revista.class);
		
		subrayado("d. Todas las publicaciones del array publicaciones con ID, título y precio pero filtrando con un precio mayor de 20 euros.");
		tituloIdPrecio(publicaciones);
		
		subrayado("e. Libros del array con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.");
		tituloIdFiltradoPrecioMayor(publicaciones, Libro.class, 20);
		
		subrayado("Solo revistas del array publicaciones con ID y título y precio pero filtrando aquellas que tienen un precio mayor de 3 euros.");
		tituloIdFiltradoPrecioMayor(publicaciones, Revista.class, 3);

		subrayado("Utiliza el libro Ulises, pero dentro del array. No utilices lib7.");
		for (Publicacion publicacion : publicaciones) {
			if(publicacion.getTitulo() == "Ulises") {
				publicacion.show();
				
				subrayado("Lee 295 páginas de forma silenciosa con el método estático y verifica que estás en la página 299.");
				for (int i = 0; i <= 295; i++) {
					publicacion.leePagina(true);
				}
				
				subrayado("Lee 5 páginas de forma NO silenciosa con el método estático y verifica que estás en la página 304.");
				for (int i = 0; i < 5; i++) {
					publicacion.leePagina(true);	
				}
				
				subrayado("Lee 10 páginas  de forma NO silenciosa con el método NO estático y verifica que estás en la página 314.");
				for (int i = 0; i < 10; i++) {
					publicacion.leePaginaStatic(true, publicacion);;
				}
				
				subrayado("Lee 1000 páginas con el método NO estático y verifica que figura como leído y está en la página 400");
				for (int i = 0; i < 1000; i++) {
					publicacion.leePaginaStatic(true, publicacion);
				}
			}
		}


			
			
		
	}	
	
}
