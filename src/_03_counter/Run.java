package _03_counter;

public class Run {
	public static void main(String[] args) {
//		Contadores
		
		Counter[] counters = {
			    new Counter(),
			    new Counter(20, "MONALISA"),
			    new Counter(-10),
			    new Counter(78976)
			};

		
//		Counter c1 = new Counter();
//		Counter c2 = new Counter(20, "MONALISA");
//		Counter c3 = new Counter(-10);
//		Counter c4 = new Counter(78976);
//		
		
		System.out.printf("Contador c1");
		System.out.printf("%n------------%n");
		counters [0].show(false);
		
		System.out.printf("%nContador c2");
		System.out.printf("%n------------%n");
		counters [1].show(true);
		
//		Esto es válido pero el nuevo contador no se está guardando en ninguna instancia 
//		como si pasa arriba que la guardamos en c1
//		new Counter().show();
		
//		Esto muestra la copia de c1
//		new Counter(c1).show();
		System.out.printf("%nLa suma total del valor de los contadores es ");
		
		System.out.print(Counter.totalValoresContadores(counters));	
		
	}

}
