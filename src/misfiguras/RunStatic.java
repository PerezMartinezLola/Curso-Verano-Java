package misfiguras;

public class RunStatic {
	
	public static void subrayadoEnunciado(String enunciado) {
		System.out.printf("%n%s%n", enunciado);
		System.out.println("-".repeat(enunciado.length()));
	}
	
	public static Figura [] figurasFiltradas (Figura [] figuras, boolean perimetro, Class <?> clase) {
		double suma = 0;
		int contadorFiguras = 0;
		
		for (Figura figura : figuras) {
			if((clase.isInstance(figura))){
				suma += perimetro ? figura.perimetro() : figura.area();
				contadorFiguras++;
			}
		}
		double mediaValor = suma / contadorFiguras;
		
		System.out.printf("-La media de %s es: %.3f.%n", perimetro ? "los perimetros" : "las áreas", mediaValor);
		
		for (Figura figura : figuras) {
			if((clase.isInstance(figura))){
				double valorFigura = perimetro ? figura.perimetro() :  figura.area();
				if(valorFigura > mediaValor) {
					System.out.println(figura.toString());
				}
			}
		}
		return figuras;
	}
	
	
	public static void main(String[] args) {
		
		subrayadoEnunciado("a. Array de 10 cuadrados, 10 círculos y 10 rectángulos");
		
		Figura [] figuras = {new Cuadrado(), new Cuadrado(10, Color.AZ), new Cuadrado(30, Color.RO),new Cuadrado(15, Color.VE), 
							new Cuadrado(), new Cuadrado(25, Color.AM),new Cuadrado(5, Color.BL), new Cuadrado(20, Color.NA), 
							new Cuadrado(), new Cuadrado(35, Color.MA),
							
							new Circulo(), new Circulo(25, Color.RS), new Circulo(15, Color.PU), new Circulo(20, Color.AZ), 
							new Circulo(), new Circulo(30, Color.VE),new Circulo(10, Color.AM), new Circulo(35, Color.RO), 
							new Circulo(), new Circulo(5, Color.GR),
							
							new Rectangulo(), new Rectangulo(30, Color.AM), new Rectangulo(15, 15, Color.NE), 
							new Rectangulo(20, Color.RO), new Rectangulo(25, 10, Color.VE), new Rectangulo(),
						    new Rectangulo(40, Color.AZ), new Rectangulo(10, 20, Color.GR), new Rectangulo(),
						    new Rectangulo(35, 15, Color.PU)};
		
		
		for (Figura figura : figuras) {
			System.out.println(figura.toString());
		}
		
		
		subrayadoEnunciado("b. Listado de los cuadrados que tienen un valor de perímetro mayor que la media.");
		figurasFiltradas(figuras, true, Cuadrado.class);
		
		
		subrayadoEnunciado("c. Listado de los rectángulos que tienen un valor de perímetro mayor que la media.");
		figurasFiltradas(figuras, true, Rectangulo.class);
		

		subrayadoEnunciado("d. Listado de los circulos que tienen un valor de perímetro mayor que la media.");
		figurasFiltradas(figuras, true, Circulo.class);
		
		
		subrayadoEnunciado("e. Listado de los cuadrados que tienen un valor de area mayor que la media.");
		figurasFiltradas(figuras, false, Cuadrado.class);
		

		subrayadoEnunciado("f. Listado de los rectángulos que tienen un valor de área mayor que la media.");
		figurasFiltradas(figuras, false, Rectangulo.class);
		

		subrayadoEnunciado("g. Listado de los círculos que tienen un valor de área mayor que la media.");
		figurasFiltradas(figuras, false, Circulo.class);
		

		subrayadoEnunciado("h. Listado de las figuras que tienen un valor de perímetro mayor que la media.");
		figurasFiltradas(figuras, true, Figura.class);
		

		subrayadoEnunciado("i. Listado de las figuras que tienen un valor de área mayor que la media.");
		figurasFiltradas(figuras, false, Figura.class);
		
	}
}
