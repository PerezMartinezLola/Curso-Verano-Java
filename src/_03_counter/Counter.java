package _03_counter;

public class Counter {
	private int value;
	private int maxValue; //100_000
	private String model; //N-COUNTER
	private static long contadoresCreados = 0;
	private static String nombreEnEspaniol = "Contador";
	
	
	//CONSTRUCTORES
	
	public Counter (int maxValue, String model) {
//		Le preguntamos a la clase por los contadores y no a la instancia en particular
//		por eso no es recomendable poner el this
//		tambien funciona poner solo contadoresCreados++
		Counter.contadoresCreados++;
		this.maxValue = maxValue <= 10 ? 10 : maxValue > 1_000_000 ? 1_000_000 : maxValue;
//		Si ponemos la condicion al reves explota porque le preguntas la longitud a null
		this.model = model == null || model.length() < 3 ? "N-COUNTER": model;
		
	}
	//tengo que crearlo si me piden mas constructores porque Java lo elimina
	public Counter () {
	}
	
	public Counter (int maxValue) {
		//this(maxValue, "CASIO");
		this(maxValue, null);
	}
	
//	public Counter (int maxValue, String model) {
////		si no verificamos aqui que no sea null el model puede ser nulo si no lo insertamos
////		por parámetros
//		this(0, maxValue, model);
//	}
	
	public Counter (Counter c) {
//		aqui el this se puede quitar
//		En la copia no es necesario hacer restricciones porque ya aparecen en el constructor
//		que estamos copiando
		Counter.contadoresCreados++;
		this.value = c.value;
		this.maxValue = c.maxValue;
		this.model = c.model;
		
	}

	
//	MÉTODOS
	public void show (boolean espaniol) {
		if(espaniol) {
			System.out.printf("%s: modelo (%s) y valor %d de maxValue %d.%n", 
					nombreEnEspaniol, model, value, maxValue);
		}else {
			
			System.out.printf("Counter: model (%s) and value %d of maxValue %d.%n", 
					model, value, maxValue);
		}
	}
	
	public boolean increment () {
		return increment(1);
//		boolean contadorIncrementable = value != maxValue;
//				value = contadorIncrementable ? value + 1 : value;
//				return contadorIncrementable;
		
//		Otro modo
//			if(value == maxValue) {
//				return false;
//			}else {
//				value++;
//				return true;
//			}
	}
	
	public boolean increment (int n) {
		if(n < 1) return false;
		
		boolean contadorIncrementable = value + n <= maxValue;
				value = contadorIncrementable ? value + n : maxValue;
				return contadorIncrementable;
	}
	
	
	public boolean reset() {
		if(value == maxValue) {
			value = 0;
			return true;
		}
		return false;
	}

//	un metodo con array de contadores que devuelva la suma de todos los contadores un long
	public static long totalValoresContadores (Counter [] arrayContadores) {
		long sumaValores = 0;
		
		for (Counter contador : arrayContadores) {
			sumaValores +=	contador.value;
		}
		return sumaValores;
	}
	
	
}
