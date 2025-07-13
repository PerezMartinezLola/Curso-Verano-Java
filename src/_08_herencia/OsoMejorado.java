package _08_herencia;

public class OsoMejorado extends AnimalMejorado{
	
	public OsoMejorado (double peso) {
		super(peso);
	}

	public void rugir (int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Grrr" + " ");
		}
		System.out.println();
	}
}
