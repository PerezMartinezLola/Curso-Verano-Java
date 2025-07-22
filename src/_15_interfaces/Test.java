package _15_interfaces;

public class Test {
public static void main(String[] args) {
	Loro l1 = new Loro();
	Animal l2 = new Loro();
	Volador l3 = new Loro();
	Mascota l4 = new Loro();
	Object o = new Loro();
	
	System.out.printf("Loro es una instacia de Volador: %s%n", l1 instanceof Volador);	
	System.out.printf("Loro es una instacia de Mascota: %s%n", l1 instanceof Mascota);	
	System.out.printf("Loro es una instacia de Object: %s%n", l1 instanceof Object);	
	System.out.printf("Loro es una instacia de Volador: %s%n", o instanceof Volador);
}
}
