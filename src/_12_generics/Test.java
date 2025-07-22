package _12_generics;

public class Test {
	
	
public static void main(String[] args) {
	System.out.println(new BoxDeString("Hola"));
	System.out.println(new BoxDeDouble((double) 10));
	System.out.println(new BoxDeDouble(10.50));
	
	System.out.println(new Box <Double>(3.));
	
//	Puedes poner en el generics en vez de la clase el Object porque todo hereda de object
//	raw type
	System.out.println(new Box <Object> (3.));
	
	
}
}
