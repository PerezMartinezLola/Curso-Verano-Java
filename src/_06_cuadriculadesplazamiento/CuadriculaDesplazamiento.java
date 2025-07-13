package _06_cuadriculadesplazamiento;

import java.util.Arrays;

public class CuadriculaDesplazamiento {
		private int x;
		private int y;
		private int filas;
		private int columnas;
		private int [] desplazamientos;
		
		
		
		
		public CuadriculaDesplazamiento (int x, int y, int filas, int columnas, int [] desplazamientos) {
			this.x = x < 0 ? 0 : x < filas ? filas : x > filas ? filas : x;
			this.y = y < 0 ? 0 : y < columnas ? columnas : y > columnas ? columnas : y;
			this.filas = filas < 0 ? 0 : filas;
			this.columnas = columnas < 0 ? 0 :columnas;
			this.desplazamientos = desplazamientos;
			
		}
		
		public void desplazamientos() {
			
		}



		@Override
		public String toString() {
			return "Cuadricula [x= " + x + ", y= " + y + ", filas= " + filas + ", columnas= " + columnas + ", desplazamientos= "
					+ Arrays.toString(desplazamientos) + "]";
		}
		
	
}
