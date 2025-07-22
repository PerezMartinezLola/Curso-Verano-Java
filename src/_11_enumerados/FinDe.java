package _11_enumerados;

public enum FinDe {
	VI("friday", "viernes", 5), SA("saturday", "sábado", 6), DO("sunday", "domingo", 7);
	
	private String enIngles;
	private String enEspaniol;
	private int numeroDia;
	
	
	
	private FinDe(String enIngles, String enEspañol, int numeroDia) {
		this.enIngles = enIngles;
		this.enEspaniol = enEspañol;
		this.numeroDia = numeroDia;
	}
	
	public static int darNumeroDia(FinDe dia) {
		return dia.numeroDia;
	}
	
	@Override
	public String toString () {
		return String.format("Hoy es %s (%s), día de la semana %d.%n", enEspaniol, 
							enIngles, numeroDia);
	}

	public static void main(String[] args) {
		FinDe hoy = FinDe.SA;
		
		System.out.println(FinDe.SA);
		System.out.println(FinDe.SA.toString());
		
		System.out.printf("El %s tiene el número de la semana %d.%n", SA.enEspaniol, darNumeroDia(SA));
		
		System.out.printf("%nEl sabado es, según el método ordinal, el número %d.%n",FinDe.SA.ordinal());
	}

}
