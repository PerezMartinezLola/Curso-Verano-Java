package _15_interfaces;

public class Loro extends Animal implements Volador, Mascota{

	@Override
	public boolean despegar() {
		System.out.println("Loro despegando");
		return true;
	}

	@Override
	public boolean aterrizar() {
		System.out.println("Loro aterrizando");
		return true;
	}

	@Override
	public boolean planear(int metros) {
		System.out.println("Loro planeando" + metros + "metros.");
		return true;
	}

	@Override
	public void acariciar() {
		System.out.println("Loro acariciado y feliz");
		
	}

}
