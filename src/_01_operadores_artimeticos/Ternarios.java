package _01_operadores_artimeticos;

public class Ternarios {
	public static void main(String[] args) {
		int x = 16;

		System.out.println(x <= 7 ? "A" : x <= 14 ? "B" : "C");

		// Trabajando entre 18 y 65 años ambos incluidos

		int edad = 0;

		if (edad >= 18 && edad <= 65) {
			System.out.printf("La persona esta trabajando");
		} else if (edad < 18) {
			System.out.printf("La persona aún no está en edad de trabajar");
		} else {
			System.out.printf("La persona ya se ha jubilado");
		}

		
		//Javi
		boolean trabajando = false;
		x = 20;
		trabajando = x < 18 ? false: x <= 65 ? true: false;
		
		
		//Poner false el rango de entre 18 y 65 ambos inclusive, lo demas true
		if(edad < 18 || edad > 65) {
			System.out.printf("%nLa persona no esta trabajando%n");
		}else {
			System.out.printf("%nLa persona esta trabajando%n");
		}
	}

}
