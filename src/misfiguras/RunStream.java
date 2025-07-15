package misfiguras;

import java.util.ArrayList;
import java.util.Arrays;

public class RunStream {
	
	public static void subrayadoEnunciado(String enunciado) {
		System.out.printf("%n%s%n", enunciado);
		System.out.println("-".repeat(enunciado.length()));
	}
	
	
	public static void main(String[] args) {
		
		subrayadoEnunciado("a. Array de 10 cuadrados, 10 círculos y 10 rectángulos");
		
		ArrayList<Figura> figurasAL = new ArrayList<>(Arrays.asList(
				new Cuadrado(), new Cuadrado(10, Color.AZ), new Cuadrado(30, Color.RO),new Cuadrado(15, Color.VE), 
				new Cuadrado(), new Cuadrado(25, Color.AM),new Cuadrado(5, Color.BL), new Cuadrado(20, Color.NA), 
				new Cuadrado(), new Cuadrado(35, Color.MA),
				
				new Circulo(), new Circulo(25, Color.RS), new Circulo(15, Color.PU), new Circulo(20, Color.AZ), 
				new Circulo(), new Circulo(30, Color.VE),new Circulo(10, Color.AM), new Circulo(35, Color.RO), 
				new Circulo(), new Circulo(5, Color.GR),
				
				new Rectangulo(), new Rectangulo(30, Color.AM), new Rectangulo(15, 15, Color.NE), 
				new Rectangulo(20, Color.RO), new Rectangulo(25, 10, Color.VE), new Rectangulo(),
			    new Rectangulo(40, Color.AZ), new Rectangulo(10, 20, Color.GR), new Rectangulo(),
			    new Rectangulo(35, 15, Color.PU)
				));
		
		figurasAL.stream()
			.forEach(System.out::println);
		;
				

		subrayadoEnunciado("b. Listado de los cuadrados que tienen un valor de perímetro mayor que la media.");
		
		int perimetrosCuadrados = 0;
		
		figurasAL.stream()
				.filter(Figura -> Figura instanceof Cuadrado)
				.map(Cuadrado -> Cuadrado.perimetro())
				.forEach(System.out::println);
				;
		
		
		
		
		
	}

}
