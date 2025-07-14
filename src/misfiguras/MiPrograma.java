package misfiguras;

public class MiPrograma {

	public static void main(String[] args) {
		System.out.printf("Figuras");
		System.out.printf("%n--------%n");
		Cuadrado cu1 = new Cuadrado(5, Color.AM);
//		Rectangulo r1 = new Rectangulo(20, 10);
//		Circulo c1 = new Circulo(20);
		
		System.out.println(cu1.toString());	
//		System.out.println(r1.toString());
//		System.out.println(c1.toString());
		
		System.out.printf("%nAreas y perimetros");
		System.out.printf("%n------------------%n");
		System.out.printf("El area es %.2f", cu1.area());	
		
		
		//System.out.printf("%nLas areas %s son iguales.", cu1.compararAreas(r1) ? "" : "no");			
		
	}

}
