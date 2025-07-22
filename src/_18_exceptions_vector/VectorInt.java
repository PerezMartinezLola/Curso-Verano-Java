package _18_exceptions_vector;

public class VectorInt {
	private int x;
	private int y;
	
	public VectorInt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public VectorInt(int valor) {
		x = y = valor;
	}
	
	public VectorInt suma(VectorInt v) throws VectorOutOfBoundsException{
		boolean sumaFueraRango = (long) this.x + v.x < Integer.MIN_VALUE || 
								 (long) this.x + v.x > Integer.MAX_VALUE || 
								 (long) this.y + v.y < Integer.MIN_VALUE || 
								 (long) this.y + v.y > Integer.MAX_VALUE;
		
		if(sumaFueraRango) {
			System.out.printf("La suma errónea: [x=%d, y=%d] %n", (this.x + v.x), (this.y + v.y));
			throw new VectorOutOfBoundsException("¡ERROR! Fuera de rango");
		}
			return new VectorInt ((this.x + v.x), (this.y + v.y));	
	}
	
	@Override
	public String toString() {
		return "Vector [x= " + x + ", y= " + y + "]";
	}

	public static void main(String[] args) {
		try {
			System.out.println(new VectorInt(Integer.MAX_VALUE).suma(new VectorInt(Integer.MAX_VALUE,30)));
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(new VectorInt(600).suma(new VectorInt(1500,3266556)));
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
