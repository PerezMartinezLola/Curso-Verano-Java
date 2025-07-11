package _01_operadores_artimeticos;

public class Arrays {
	public static void main(String[] args) {
		int [][] arrayB = new int [3] [2];
		
		int numeros = 1;
		for (int i = 0; i < arrayB.length; i++) {
			for (int j = 0; j < arrayB.length - 1; j++) {
				arrayB [i] [j] = numeros * 2;
				numeros++;
				System.out.print(arrayB [i] [j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		//Array 4 dimensiones Javi
		int [][][][] array4D = { 
                {
                    {
                        {1, 2},{3}
                    },
                    {
                        {4,5},{6,7},{8,9}
                    }
                    
                }
                , {
                    {
                        {10},{11,12}
                    },
                    {
                        {13},{14,15,16},{17,18}
                        
                    },
                    {
                        {19}
                        
                    }
                } 
                , {{{20},{21},{22}}}

             };
		
		//Bucle for
		numeros = 1;
		for (int i = 0; i < array4D.length; i++) {
			for (int j = 0; j < array4D[i].length ; j++) {
				for (int l = 0; l < array4D[i][j].length ; l++) {
					for (int k = 0; k < array4D[i][j][l].length; k++) {
						System.out.print(array4D [i][j][l][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		int[][]array1[]  = new int[3][2][];

		int[][][] array = new int[3][][];
		array[0] = new int[3][];
		array[1] = new int[2][];
		array[2] = new int[7][];
		array[0][0] = new int []{2, 4};
		
		int[][][] array3 = new int[3][2][];
		
		int soles = 10;
		float f = 3.0f;
		
		float multiplica = soles * f;
		
	}
}
