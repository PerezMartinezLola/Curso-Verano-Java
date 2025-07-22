package _20_bloques;

public class Ejemplos {
	private int propiedad;
	private static int propiedadEstatica;
	
	
//	3. Luego crea la instancia
	public Ejemplos(){
		super();
//		Acabo de crear el objeto
		System.out.println("this recien creado (this sin propiedades especificas).");
//		le asigno una propiedad
		propiedad = 10;
		System.out.println("this modificado con las propiedades específicas.");
	}
	
	
//	2. Primero crea los bloques de instancia
	{
		System.out.println("Soy el bloque 1");
		propiedad = 10;
	}
	{
		System.out.println("Soy el bloque 2");
	}
	
	
//	1. El bloque estatico es lo primero que se crea
	static{
//		aqui no puedo acceder a propiedades de instancias pero si a propiedades estáticas
		System.out.println("Soy un bloque estático");
		propiedadEstatica = 20;
	}
	
	
//	Primero se ejecuta el static, luego se crea el objeto (el this) con el super() del contructor, más tarde 
//	imprime los bloques de instancia, y finalmente le da los aributos al objeto.
	
	public static void main(String[] args) {
		System.out.println("Hola");
		new Ejemplos();
		new Ejemplos();
	}
}
