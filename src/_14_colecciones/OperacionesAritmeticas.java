package _14_colecciones;

import java.util.ArrayList;
import java.util.Random;

public class OperacionesAritmeticas {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int numInicio = 0;
		int numeroFinal = 100;
		
		ArrayList <Integer> numerosAL = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			numerosAL.add(random.nextInt(numInicio, numeroFinal + 1));
		}
		
		System.out.printf("%sArrayList 20 numeros aleatorios entre 0 y 100", "\033[33m");
		System.out.printf("%n----------------------------------------------%n%s", "\033[0m");
		System.out.println(numerosAL);
		
		System.out.printf("%n%sSuma de los valores", "\033[33m");
		System.out.printf("%n---------------------%n%s", "\033[0m");
		
		
		System.out.println(
				numerosAL.stream()
						.mapToInt(n -> n)
						.sum()
						);
//		Integer::intValue -> cada elemento x de tipo Integer, extrae su valor primitivo (int).
		System.out.println(
		numerosAL.stream()
				.mapToInt(Integer::intValue)
				.sum()
				);
		
		System.out.printf("%n%sLa media de los valores", "\033[33m");
		System.out.printf("%n------------------------%n%s", "\033[0m");
		
		System.out.println(
		numerosAL.stream()
				.mapToDouble(Integer::doubleValue)
				.average()
				);	
		
		System.out.printf("%n%sEl máximo de los valores", "\033[33m");
		System.out.printf("%n---------------------------%n%s", "\033[0m");
		
		System.out.println(
		numerosAL.stream()
				.mapToDouble(Integer::doubleValue)
				.max()
				);
		
		System.out.printf("%n%sEl minimo de los valores", "\033[33m");
		System.out.printf("%n---------------------------%n%s", "\033[0m");
		
		System.out.println(
		numerosAL.stream()
				.mapToDouble(Integer::doubleValue)
				.min()
				);
		
		
		
	}
	
}
