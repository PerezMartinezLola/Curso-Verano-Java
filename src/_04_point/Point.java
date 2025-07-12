package _04_point;

import java.util.Iterator;

public class Point {
	private byte x;
	private byte y;
	private String colour;
	private char symbol;
	
	// para cambiar el color del texto en consola
	private final String black = "\033[30m"; 
	private final String white = "\033[37m";
	private final String red = "\033[31m"; 
	private final String green = "\033[32m"; 
	private final String yellow = "\033[33m"; 
	private final String blue = "\033[34m"; 
	private final String purple = "\033[35m"; 
	// para poner el texto en el color por defecto
	private final String reset = "\u001B[0m";
	
	public Point () {
	}
	
	public Point (byte x, byte y) {
		this(x, y, "red", 'l');
	}
	
	public Point (byte x, byte y, String colour, char symbol) {
		this.x = x < 0 ? 0 : x >= 12 ? 12 : x;
		this.y = y < 0 ? 0 : y >= 7 ? 7 : y;
		this.colour = colour.equalsIgnoreCase("black") || colour.equalsIgnoreCase("red") || 
					  colour.equalsIgnoreCase("green") || colour.equalsIgnoreCase("yellow") ||
					  colour.equalsIgnoreCase("blue") || colour.equalsIgnoreCase("purple") 
					  ? colour : "black";
		this.symbol = symbol;
	} 
	
	public Point (String colour, char symbol) {
		this((byte) 0, (byte) 0, colour, symbol);
	}
	
	public Point (Point c) {
		this.x = c.x;
		this.y = c.y;
		this.colour = c.colour;
		this.symbol = c.symbol;
	}
	
	public void showSimple () {
		System.out.printf("Point %c de color %s (%d, %d)%n", symbol, colour, x, y);
	}
	
	public boolean up() {
		//Si el desplazamientoArriba no es 7, up = true;
		boolean desplazamientoArriba = y != 7; 
		y = (byte) (desplazamientoArriba ? y + 1 : y);
		return desplazamientoArriba;
		
	}
	
	public boolean down() {
//		Si el desplazamientoAbajo no es 0, down = true;
		boolean desplazamientoAbajo = y != 0 ;
		 y = (byte) (desplazamientoAbajo ? y - 1 : y);
		return desplazamientoAbajo;
	}
	
	public boolean right () {
		boolean desplazamientoDerecha = x != 12;
		x = (byte) (desplazamientoDerecha ? x + 1 : x);
		return desplazamientoDerecha;
	}
	
	public boolean left () {
		boolean desplazamientoIzquierda = x != 0;
		x  = (byte)(desplazamientoIzquierda ? x - 1 : x);
		return desplazamientoIzquierda;
	}
	
	private String getColor(String color) {
		switch (color) {
		case "red":
			return red;
		case "green":
			return green;
		case "yellow":
			return yellow;
		case "blue":
			return blue;
		case "purple":
			return purple;

		default:
			return black;
		}
	}
	
	public void show () {
		
		int longitudX = 12;
		int longitudY = 7;
		
		System.out.println();
				for (int i = longitudY; i >= 0; i--) {
					System.out.print(i + " ");
					for (int j = 0; j <= longitudX; j++) {
						if(x == j && y == i) {
							if(j < longitudX) {
								System.out.print(getColor(colour) + symbol + "\033[37m" + "--");
							}else {
								System.out.print(getColor(colour) + symbol + "\033[37m");
							}
						}else {
							if(j < longitudX) {
								System.out.print("\033[37m" + "+--");
							}else {
								System.out.print("\033[37m" + "+");
							}
						}
						
					}
					
					System.out.println();
					if(i != 0) {
						System.out.print(" ");
						for (int j = 0; j <= longitudX; j++) {
							System.out.print(" | ");
						}
						System.out.println();
						
					}
					
			}
		
		for (int i = 0; i <= longitudX; i++) {
			if(i == 0) {
				System.out.print("  " + i + "  ");
			}else if(i <= 9) {
				System.out.print(i + "  ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		
		System.out.println("\n" + getColor(colour) + "Point " + symbol + " de color " + colour + " (" + x + "," + y + ")" + "\n" + "\033[37m");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int longitudX = 12;
		int longitudY = 7;
		int numerosEnY = 7;
		
		x = (byte)(x < 0 ? 0 : x > longitudX ? longitudX : x);
		y = (byte)(y < 0 ? 0 : x > longitudY ? longitudY : y);
		
		System.out.println();
		
			for (int k = 0; k < 15; k++) {
				if(k % 2 == 0) {
					System.out.print(numerosEnY + " ");
					numerosEnY--;
					for (int j = 0; j <= longitudX; j++) {
						if(j < longitudX) {
							if(j == x && longitudX == y) {
								System.out.print("\033[31m" + symbol);
								System.out.print("\033[37m" +  "--");
							}else {
								System.out.print("+--");
							}
						}else {
							System.out.print("+");
						}
					}
				}else {
					for (int j = 0; j <= longitudX; j++) {
						System.out.print( " " + " |");
					}
				}
				System.out.println();
				
			}
		
		
		
		for (int i = 0; i <= longitudX ; i++) {
			if(i == 0) {
				System.out.print("  ");
			}
			if(i < 10) {
				System.out.print(i + "  ");
			}else {
				System.out.print(i + " ");
			}
		}*/
	}
}
