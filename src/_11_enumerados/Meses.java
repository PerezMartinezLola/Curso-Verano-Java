package _11_enumerados;

import java.nio.file.spi.FileSystemProvider;

public enum Meses {
	EN (1, "Enero", "Janury"), 
	FE (2, "Febrero","Febrary"), 
	MA (3, "Marzo", "March"),
	AB (4, "Abril", "April"), 
	MY (5, "Mayo", "May"), 
	JN (6, "Junio", "June"), 
	JL (7, "Julio", "July"), 
	AG (8, "Agosto", "August"), 
	SE (9, "Septiembre", "September"), 
	OC (10, "Octubre", "October"), 
	NO (11, "Noviembre", "November"), 
	DI (12, "Diciembre", "December");
	
	
	private int numeroMes;
	private String enEspañol;
	private String enIngles;
	
	
	
	private Meses(int numeroMes, String enEspañol, String enIngles) {
		this.numeroMes = numeroMes;
		this.enEspañol = enEspañol;
		this.enIngles = enIngles;
	}
	
	private static String mesValido (int numeroMes) {
		
		switch (numeroMes) {
		case 1:
			return Meses.EN.toString();
		case 2:
			return Meses.FE.toString();
		case 3:
			return Meses.MA.toString();
		case 4:
			return Meses.AB.toString();
		case 5:
			return Meses.MA.toString();
		case 6:
			return Meses.JN.toString();
		case 7:
			return Meses.JL.toString();
		case 8:
			return Meses.AG.toString();
		case 9:
			return Meses.SE.toString();
		case 10:
			return Meses.OC.toString();
		case 11:
			return Meses.NO.toString();
		case 12:
			return Meses.DI.toString();
		default:
			return "¡ERROR! Ese número no corresponde a ningún mes."; 
		}
	}
	
//	Metodo Javi
	public static Meses mesPorNumero (int numero) {
		for (Meses m : Meses.values()) {
			if(m.numeroMes == numero) {
				return m;
			}
		}
		return null;
	}
	
	private static void subrayado (String enunciado) {
		System.out.printf("%n%s%n", enunciado);
		System.out.printf("%s%n","-".repeat(enunciado.length()));
	}
	
	
	public String toString() {
		return String.format("%d: %S (%s)", numeroMes, enEspañol, enIngles);
	}
	public static void main(String[] args) {
		Meses m1 = Meses.JL;
		
		System.out.println(m1);
		
	
		subrayado("Mi método dado un número");
		System.out.println(mesValido(12));	
		System.out.println(mesValido(13));
		System.out.println(mesValido(0));
		
		subrayado("Método Javi dado un número");
		System.out.println(mesPorNumero(12));
	}
	

}
