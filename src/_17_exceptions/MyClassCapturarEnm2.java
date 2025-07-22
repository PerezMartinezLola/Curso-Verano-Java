package _17_exceptions;

public class MyClassCapturarEnm2 {
	
public static void m1() {
	System.out.println("¡Hola! Soy el principio de m1");
	m2();
	System.out.println("¡Hola! Soy el final de m1");
	}


public static void m2() {
	System.out.println("¡Hola! Soy el principio de m2");
	try {
		int i = 10 / 0;
	}catch (Exception e) {
		System.out.println("Excepción capturada en m2");
		System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
	}finally {
		System.out.println("Esto tiene que mostrarse siempre en m2");
	}
	System.out.println("¡Hola! Soy el final de m2");
	}



}