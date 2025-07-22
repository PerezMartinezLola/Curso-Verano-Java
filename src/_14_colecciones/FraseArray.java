package _14_colecciones;

public class FraseArray {
	private String [] palabras;
	
	
	
	public FraseArray (String frase) {
		palabras = frase.split(" ");
//		split: guarda cada palabra como un elemento del array
	}

	@Override
	public String toString() {
		String resultado = "";
		for (String palabra : palabras) {
			resultado += palabra + " ";
		}
		return resultado;
	}
	
	public void addPalabra (String palabra) {
		String [] arrayNuevo = new String [palabras.length +1];
		String [] arrayViejo = palabras;
		
		for (int i = 0; i < arrayViejo.length; i++) {
			arrayNuevo [i] = arrayViejo [i];
		}
		
		arrayNuevo [arrayNuevo.length - 1] = palabra;
		palabras = arrayNuevo;
	}
	
	public static void main(String[] args) {
		FraseArray f1 = new FraseArray("Hola Caracola");
		System.out.println(f1);
		f1.addPalabra("del mar");
		System.out.println(f1);
	}
	

}
