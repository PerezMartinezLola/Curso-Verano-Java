package _17_exceptions;

public class Run {
	private static void subrayado (String enunciado) {
		System.out.printf("%n%S%n", enunciado);
		System.out.println("-".repeat(enunciado.length()));
	}
	public static void main(String[] args) {
		subrayado("-RECORRIDO NORMAL-");
		System.out.println("Soy el principio de main");
		MyClassRecorrido.m1();
		MyClassRecorrido.m2();
		System.out.println("Soy el final de main");	
		
		subrayado("-CAPTURADO EN M1-");
		System.out.println("Soy el principio de main");
		MyClassCapturarEnm1.m1();
		System.out.println("Soy el final de main");
		
		subrayado("-CAPTURADO EN M2-");
		System.out.println("Soy el principio de main");
		MyClassCapturarEnm2.m1();
		MyClassCapturarEnm2.m2();
		System.out.println("Soy el final de main");
		
		subrayado("-CAPTURADO EN M2 MULTICATCH-");
		System.out.println("Soy el principio de main");
		MyClassCapturarEnm2NullPointed.m1();
		System.out.println("Soy el final de main");
		
		subrayado("-SIN CAPTURAR-");
		System.out.println("Soy el principio de main");
		MyClassExcepcion.m1();
		MyClassExcepcion.m2();
		System.out.println("Soy el final de main");
	}
}
