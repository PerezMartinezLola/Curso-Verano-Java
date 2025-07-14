package misfiguras;

public class MiPrograma {
	
	

	public static void main(String[] args) {
		System.out.printf("Figuras");
		System.out.printf("%n--------%n");
		Cuadrado cu1 = new Cuadrado(5, Color.AM);
		Rectangulo r1 = new Rectangulo(20, 10, Color.GR);
		Circulo c1 = new Circulo(20, Color.PU);
		
		System.out.println(cu1.toString());	
		System.out.println(r1.toString());
		System.out.println(c1.toString());
		
		System.out.printf("%nAreas y perimetros");
		System.out.printf("%n-------------------%n");
		System.out.printf("El area es %.2f", cu1.area());	
		
		
		System.out.printf("%nLas areas %s son iguales.%n", cu1.compararAreas(r1) ? "" : "no");			
		
		
//		a. Crear un conjunto de 10 cuadrados, 10 círculos y 10 rectángulos con datos válidos.
		System.out.printf("%nArray de 10 cuadrados, 10 círculos y 10 rectángulos");
		System.out.printf("%n----------------------------------------------------%n");
		
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
		
//		b. Obtener un listado de los cuadrados que tienen un valor de perímetro mayor que la media.
		System.out.printf("%nListado de los cuadrados que tienen un valor de perímetro mayor que la media.");
		System.out.printf("%n-----------------------------------------------------------------------------%n");
		int sumaPerimetrosCuadrados = 0;
		int contadorCuadrados = 0;
		
		
		for (Figura figura : figuras) {
			if((figura instanceof Cuadrado)){
				sumaPerimetrosCuadrados += figura.perimetro();
				contadorCuadrados++;
			}
		}
		double mediaPerimetrosCuadrados = (double) sumaPerimetrosCuadrados / contadorCuadrados;
		
		for (Figura figura : figuras) {
			if((figura instanceof Cuadrado)){
				if(figura.perimetro() > mediaPerimetrosCuadrados) {
					System.out.println(figura.toString());
				}
			}
		}
		
		
//		c. Obtener un listado de de los rectángulos que tienen un valor de perímetro mayor que la media.
		System.out.printf("%nListado de los rectángulos que tienen un valor de perímetro mayor que la media.");
		System.out.printf("%n-------------------------------------------------------------------------------%n");
		int sumaPerimetrosRectangulos = 0;
		int contadorRectangulos = 0;
		
		
		for (Figura figura : figuras) {
			if((figura instanceof Rectangulo)){
				sumaPerimetrosRectangulos += figura.perimetro();
				contadorRectangulos++;
			}
		}
		double mediaPerimetrosRectangulos = (double) sumaPerimetrosRectangulos / contadorRectangulos;
		
		for (Figura figura : figuras) {
			if((figura instanceof Rectangulo)){
				if(figura.perimetro() > mediaPerimetrosRectangulos) {
					System.out.println(figura.toString());
				}
			}
		}
		
//		d. Obtener un listado de de los círculos que tienen un valor de perímetro mayor que la media.
		System.out.printf("%nListado de los circulos que tienen un valor de perímetro mayor que la media.");
		System.out.printf("%n-----------------------------------------------------------------------------%n");
		int sumaPerimetrosCirculos = 0;
		int contadorCirculos = 0;
		
		
		for (Figura figura : figuras) {
			if((figura instanceof Circulo)){
				sumaPerimetrosCirculos += figura.perimetro();
				contadorCirculos++;
			}
		}
		double mediaPerimetrosCirculos = (double) sumaPerimetrosCirculos / contadorCirculos;
		
		for (Figura figura : figuras) {
			if((figura instanceof Circulo)){
				if(figura.perimetro() > mediaPerimetrosCirculos) {
					System.out.println(figura.toString());
				}
			}
		}
		
		
//		e. Obtener un listado de de los cuadrados que tienen un valor de área mayor que la media.
		System.out.printf("%nListado de los cuadrados que tienen un valor de area mayor que la media.");
		System.out.printf("%n-------------------------------------------------------------------------%n");
		int sumaAreasCuadrados = 0;
		contadorCuadrados = 0;
		
		
		for (Figura figura : figuras) {
			if((figura instanceof Cuadrado)){
				sumaAreasCuadrados += figura.perimetro();
				contadorCuadrados++;
			}
		}
		double mediaAreasCuadrados = (double) sumaAreasCuadrados / contadorCuadrados;
		
		for (Figura figura : figuras) {
			if((figura instanceof Cuadrado)){
				if(figura.perimetro() > mediaAreasCuadrados) {
					System.out.println(figura.toString());
				}
			}
		}
		
//		f. Obtener un listado de de los rectángulos que tienen un valor de área mayor que la media.
		System.out.printf("%nListado de los rectángulos que tienen un valor de área mayor que la media.");
		System.out.printf("%n-------------------------------------------------------------------------------%n");

		int sumaAreasRectangulos = 0;
		contadorRectangulos = 0;

		for (Figura figura : figuras) {
		    if (figura instanceof Rectangulo) {
		        sumaAreasRectangulos += figura.area();
		        contadorRectangulos++;
		    }
		}

		double mediaAreasRectangulos = (double) sumaAreasRectangulos / contadorRectangulos;

		for (Figura figura : figuras) {
		    if (figura instanceof Rectangulo) {
		        if (figura.area() > mediaAreasRectangulos) {
		            System.out.println(figura.toString());
		        }
		    }
		}
		
//		g. Obtener un listado de de los círculos que tienen un valor de área mayor que la media.
		System.out.printf("%nListado de los círculos que tienen un valor de área mayor que la media.");
		System.out.printf("%n------------------------------------------------------------------------%n");

		int sumaAreasCirculos = 0;
		contadorCirculos = 0;

		for (Figura figura : figuras) {
		    if (figura instanceof Circulo) {
		        sumaAreasCirculos += figura.area();
		        contadorCirculos++;
		    }
		}

		double mediaAreasCirculos = (double) sumaAreasCirculos / contadorCirculos;

		for (Figura figura : figuras) {
		    if (figura instanceof Circulo) {
		        if (figura.area() > mediaAreasCirculos) {
		            System.out.println(figura.toString());
		        }
		    }
		}
		
//		h. Obtener un listado de las figuras que tienen un valor de perímetro mayor que la media.
		System.out.printf("%nListado de las figuras que tienen un valor de perímetro mayor que la media.");
		System.out.printf("%n-------------------------------------------------------------------------%n");

		int sumaPerimetrosFiguras = 0;
		int contadorFiguras = 0;

		for (Figura figura : figuras) {
		    sumaPerimetrosFiguras += figura.perimetro();
		    contadorFiguras++;
		}

		double mediaPerimetrosFiguras = (double) sumaPerimetrosFiguras / contadorFiguras;

		for (Figura figura : figuras) {
		    if (figura.perimetro() > mediaPerimetrosFiguras) {
		        System.out.println(figura.toString());
		    }
		}
		
//		i. Obtener un listado de las figuras que tienen un valor de área mayor que la media.
		System.out.printf("%nListado de las figuras que tienen un valor de área mayor que la media.");
		System.out.printf("%n-----------------------------------------------------------------------%n");

		int sumaAreasFiguras = 0;
		contadorFiguras = 0;

		for (Figura figura : figuras) {
		    sumaAreasFiguras += figura.area();
		    contadorFiguras++;
		}

		double mediaAreasFiguras = (double) sumaAreasFiguras / contadorFiguras;

		for (Figura figura : figuras) {
		    if (figura.area() > mediaAreasFiguras) {
		        System.out.println(figura.toString());
		    }
		}
	}

}
