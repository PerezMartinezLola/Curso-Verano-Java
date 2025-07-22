package _18_exceptions_vector;

public class Vector {
	private byte x;
	private byte y;
	
	public Vector(byte x, byte y) {
		this.x = (byte) x;
		this.y = (byte) y;
	}
	
	public Vector(byte valor) {
		x = y = valor;
	}
	
	public Vector suma(Vector v) throws VectorOutOfBoundsException{
		boolean sumaFueraRango = (this.x + v.x < Byte.MIN_VALUE || this.x + v.x > Byte.MAX_VALUE || 
				   this.y + v.y < Byte.MIN_VALUE || this.y + v.y > Byte.MAX_VALUE);
		
		if(sumaFueraRango) {
			System.out.printf("La suma errónea: [x=%d, y=%d] %n", (this.x + v.x), (this.y + v.y));
			throw new VectorOutOfBoundsException("¡ERROR! Fuera de rango");
		}
			return new Vector ((byte)(this.x + v.x), (byte)(this.y + v.y));	
	}
	
	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Vector v1 = new Vector((byte) 127,(byte) -127);
		Vector v2 = new Vector((byte) 30,(byte) 4);
		
		System.out.println("Vectores NO sumables");
		System.out.println(v1);
		System.out.println(v2);
		
		try {
			v1.suma(v2);
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(v1.suma(v2));
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.printf("%nVectores sumables%n");
		Vector v3 = new Vector((byte) 50,(byte) 0);
		Vector v4 = new Vector((byte) 50,(byte) 4);
		System.out.println(v3);
		System.out.println(v4);
		try {
			System.out.println(v3.suma(v4));
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
