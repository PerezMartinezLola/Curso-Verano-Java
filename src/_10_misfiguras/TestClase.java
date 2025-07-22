package _10_misfiguras;

public class TestClase {
	
	private void test () {
		Cuadrado [] cuadrados = {new Cuadrado(), new Cuadrado(10, Color.AZ), new Cuadrado(30, Color.RO),new Cuadrado(15, Color.VE), 
				new Cuadrado(), new Cuadrado(25, Color.AM),new Cuadrado(5, Color.BL), new Cuadrado(20, Color.NA), 
				new Cuadrado(), new Cuadrado(35, Color.MA)};
				
		Circulo [] circulos	= {new Circulo(), new Circulo(25, Color.RS), new Circulo(15, Color.PU), new Circulo(20, Color.AZ), 
				new Circulo(), new Circulo(30, Color.VE),new Circulo(10, Color.AM), new Circulo(35, Color.RO), 
				new Circulo(), new Circulo(5, Color.GR)};
				
		Rectangulo [] rectangulos = {new Rectangulo(), new Rectangulo(30, Color.AM), new Rectangulo(15, 15, Color.NE), 
				new Rectangulo(20, Color.RO), new Rectangulo(25, 10, Color.VE), new Rectangulo(),
			    new Rectangulo(40, Color.AZ), new Rectangulo(10, 20, Color.GR), new Rectangulo(),
			    new Rectangulo(35, 15, Color.PU)};
	}

}
