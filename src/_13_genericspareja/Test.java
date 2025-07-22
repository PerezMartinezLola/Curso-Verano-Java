package _13_genericspareja;

public class Test {
	private static void subrayado (String enunciado) {
		System.out.printf("%n%s%n", enunciado);
		System.out.printf("%s%n", "-".repeat(enunciado.length()));
	}
	
	public static void main(String[] args) {
		subrayado("Parejas");
		
		Pareja <Double, String> pareja1 = new Pareja<>(10.50, "Amor");
		Pareja <Double, Integer> pareja2 = new Pareja<>(8., 58);
		Pareja<String, Integer> pareja3 = new Pareja<>("Hola Caracola", 35);
		System.out.println(pareja1);
		System.out.println(pareja2);
		System.out.println(pareja3);
		
		
		subrayado("Parejas cambiadas");
		pareja1.setP2("monkey");;
		System.out.println(pareja1);
		
		pareja2.setP2(100);
		System.out.println(pareja2);
		
		pareja3.setP1("sparrow");
		System.out.println(pareja3);
	}
}
