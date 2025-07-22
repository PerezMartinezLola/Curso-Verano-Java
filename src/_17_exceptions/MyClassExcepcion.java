package _17_exceptions;

public class MyClassExcepcion {
	
public static void m1() {
	System.out.println("¡Hola! Soy el principio de m1");
	m2();
	System.out.println("¡Hola! Soy el final de m1");
	}


public static void m2() {
	System.out.println("¡Hola! Soy el principio de m2");
	int i = 10 / 0;
	System.out.println("¡Hola! Soy el final de m2");
	}



}