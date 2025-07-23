package _21_funciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ejemplo1 {
	private static Random random = new Random();
	
	public static void main(String[] args) {
		List <String> lista = new LinkedList<>();
		lista.add("one");
		lista.add("two");
		lista.add("three");
		System.out.println(lista);
		
//		lista.removeIf((String s) -> {
//			return s.length() > 3;
//		});
		
//		Esto simplificado es;
		lista.removeIf(s -> s.length() > 3);
		
//		Que es lo mismo que hacer esto:
//		for (int i = lista.size()-1; i >= 0; i--) {
//			if(lista.get(i).length() > 3) {
//				lista.remove(i);
//			}
//		}
		
//		System.out.println(lista);
//		Es lo mismo que:
		lista.forEach(s -> System.out.print(s + " - "));
		System.out.println();
		
//		crear una lista de 100 numeros aleatorios del 1 al 100 y quitar:
//		1) los mayores de 80 y mostrar la lista
//		2) los menores de 20 y mostrar la lista
//		3) los multiplos de 2 y mostrar la lista
		
		List <Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 15; i++) {
			numeros.add(random.nextInt(1, 101));
		}
		numeros.sort((Integer n1, Integer n2) -> {return n1 - n2;});
		
		System.out.printf("%nLista de 100 numeros aleatorios%n");
		numeros.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.printf("%nQuitamos mayores de 80%n");
		numeros.removeIf(s -> s > 80);
		numeros.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.printf("%nQuitamos menores de 20%n");
		numeros.removeIf(s -> s < 20);
		numeros.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.printf("%nQuitamos los multiplos de 2%n");
		numeros.removeIf(s -> s % 2 == 0);
		numeros.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
	
	

}
