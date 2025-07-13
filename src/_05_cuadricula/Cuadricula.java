package _05_cuadricula;

public class Cuadricula {
	private int x;
	private int y;

	public Cuadricula(int x, int y) {
		this.x = x < 0 ? 0 : x > 10 ? 10 : x;
		this.y = y < 0 ? 0 : y > 10 ? 10 : y;
	}

	public void show() {
		int[][] arrayCuadricula = new int[x][y];

		for (int i = 0; i < arrayCuadricula.length; i++) {
			for (int j = 0; j <= arrayCuadricula[i].length; j++) {
				if (j < arrayCuadricula[i].length) {
					System.out.print("+------");

				} else {
					System.out.print("+");
				}
			}
			System.out.println();
			for (int j = 0; j < arrayCuadricula[i].length; j++) {
				if (j < arrayCuadricula[i].length - 1) {
					System.out.printf("|(%d, %d)", j + 1, arrayCuadricula.length - i);
				} else {
					System.out.printf("|(%d, %d)|", j + 1, arrayCuadricula.length - i);
				}
			}
			System.out.println();
			
		}
		for (int i = 0; i <= y; i++) {
			if(i < y) {
				System.out.print("+------");
			}else {
				System.out.print("+");
			}
		}
		System.out.println();
	}
	
	

}
