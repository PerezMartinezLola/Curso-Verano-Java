package _10_misfiguras;

public enum Color {
	NE("negro"), AZ("azul"), MA("marrón"),GR("gris"), VE("verde"), NA("naranja"),
	RS("rosa"), PU("purpura"), RO("rojo"), BL("blanco"), AM("amarillo");

	private String color;

	private Color(String color) {
		this.color = color;
	}
	
		
	public String getColor() {
		return color;
	}
	
	public static Color colorValido(Color color) {
		 return color != null ? color : Color.NE;
	}
	
//	Este método no tiene uso con los enum
//	public static Color colorValido(Color color) {
//		for (Color c : Color.values()) {
//			if(c == color) {
//				return c;
//			}
//		}
//		return Color.NE;
//	}
	
	public static Color [] coloresDisponibles () {
		return Color.values().clone();
	}
	
	
	
	
}
