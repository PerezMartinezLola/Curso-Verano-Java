package _17_exceptions;

public class MyClassCapturarEnm1 {
	
public static void m1() {
	System.out.println("¡Hola! Soy el principio de m1");
	try {
		m2();
	}catch(Exception e) {
		System.out.println("Excepción capturada en m1");
		System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		}
	System.out.println("Soy el final de m1");
	}


public static void m2() {
	System.out.println("¡Hola! Soy el principio de m2");
	int i = 10 / 0;
	System.out.println("¡Hola! Soy el final de m2");
	}



}