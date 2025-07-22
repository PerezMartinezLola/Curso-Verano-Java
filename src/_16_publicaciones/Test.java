package _16_publicaciones;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Test {
	
	public static void subrayado (String enunciado) {
		System.out.printf("%n%s%n", enunciado.toUpperCase());
		System.out.printf("-".repeat(enunciado.length()));
		System.out.println();
	}
	private static void listaTitID (Publicacion [] publicaciones) {
		for (int i = 0; i < publicaciones.length; i++) {
			 System.out.printf("Publicación con título: %s. ID: %d%n",publicaciones [i].getTitulo(), publicaciones [i].getId());	
		}
	}
//	private static Array [] tituloId (Publicacion [] publicaciones, boolean Libro) {
//		for (int i = 0; i < publicaciones.length; i++) {
//			if(publicaciones[i] instanceof Libro) {
//				 System.out.printf("Publicación con título: %s. ID: %d%n",publicaciones [i].getTitulo(), publicaciones [i].getId());
//			}else if()
//			
//		}
//		return null;
//	}
	
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
     
     
     
     Revista [] revistas = new Revista [5];
     
     revistas[0] = new Revista("Muy interesante", 127, false, 24.99);
	 revistas [1] = new Revista("National Geographic", 150, false, 35.60);
	 revistas [2] = new Revista("CuerpoMente", 130, false, 19.99);
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
		System.out.printf("%s%n", publicaciones [i]);
		
	}
	 
	 subrayado("a. Todas las publicaciones del array publicaciones con título y ID.");
	 listaTitID(publicaciones);
		
	 
	 subrayado("b. Solo libros del array publicaciones con ID y  título (usar instanceof para discriminar).");
	 for (int i = 0; i < publicaciones.length; i++) {
		if(publicaciones[i] instanceof Libro) {
			 System.out.printf("Publicación con título: %s. ID: %d%n",publicaciones [i].getTitulo(), publicaciones [i].getId());
		}
	}
	 
	 
}
}
