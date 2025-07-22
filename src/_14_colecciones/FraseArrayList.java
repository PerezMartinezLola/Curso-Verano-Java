package _14_colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class FraseArrayList {
	
//	private String palabras;
//
//	public FraseArrayList(String palabras) {
//		this.palabras = palabras;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("%n%s%n", palabras);
//	}
	
	public static void main(String[] args) {
		ArrayList <String> palabras = new ArrayList<>();
		String [] palabritas = {};
		
		palabras.add("Hola");
		palabras.add("adiós");
		
		System.out.printf("ArrayList en bucle con get");
		System.out.printf("%n-------------------------%n");
		for (int i = 0; i < palabras.size(); i++) {
			System.out.printf("%s ",palabras.get(i));	
		}
		System.out.println();
		
		System.out.printf("%nArrayList antes");
		System.out.printf("%n----------------%n");
		System.out.println(palabras);
		
		System.out.printf("%nArrayList después");
		System.out.printf("%n------------------%n");
		palabras.add(1, "caracola");
		System.out.println(palabras);
		
		palabritas = new String [] {"Hola", "adiós"};
		System.out.printf("%nArray");
		System.out.printf("%n------%n");
		System.out.println(Arrays.toString(palabritas));
	}
	
	
	
	
}
