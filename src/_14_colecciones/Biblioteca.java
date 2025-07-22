package _14_colecciones;

import java.util.ArrayList;

public class Biblioteca {
	
	public static void main(String[] args) {
		 ArrayList <String> biblioteca = new ArrayList<>();
		 
		
			 biblioteca.add("Cien años de soledad");
			 biblioteca.add("1984");
			 biblioteca.add("El Alquimista");
			 biblioteca.add("El principito");
			 biblioteca.add("El retrato de Dorian Grey");
		
		System.out.printf("%n%sBucle for", "\033[33m");
		System.out.printf("%n----------%n%s", "\033[0m");
		for (int i = 0; i < biblioteca.size(); i++) {
			System.out.println(biblioteca.get(i));
		}
		
		System.out.printf("%n%sBucle foreach", "\033[33m");
		System.out.printf("%n--------------%n%s", "\033[0m");
		for (String libros : biblioteca) {
			System.out.println(libros);
		}
		
	}
	
	
	
}
