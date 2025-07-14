package _09_herencia2;

public abstract class Animal {

		private double peso;
		
		
//		solo puedo tener métodos abstractos en clases abstractas
//		me deja no implementarlo (crearle un cuerpo) si es abstracto pero tengo que implementarlo
//		en los hijos
		public abstract void identificar();
		
		public void identificar2() {
			System.out.print("Insisto, soy un ");
		}
		
//		No necesita implementación en los hijos
		public void identificar3() {
			System.out.print(" ¿No me crees?, pues sí soy un " + this.getClass().getSimpleName().toLowerCase() + ".");
		}
		
		
		public Animal(double peso) {
			this.peso = peso;
		}
			
		
		public double getPeso() {
			return peso;
		}
}
