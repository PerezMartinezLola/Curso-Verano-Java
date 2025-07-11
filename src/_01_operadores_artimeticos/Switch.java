package _01_operadores_artimeticos;

public class Switch {
public static void main(String[] args) {
	int diaSemana = 99;
	String nombreDia;

	switch (diaSemana) {
	 default:
	        nombreDia = "Día inválido";
	        break;
	    case 1:
	        nombreDia = "Lunes";
	       break;
	    case 2:
	        nombreDia = "Martes";
	        break;
	    case 3:
	        nombreDia = "Miércoles";
	        break;
	    case 4:
	        nombreDia = "Jueves";
	        break;
	    case 5:
	        nombreDia = "Viernes";
	        break;
	    case 6:
	        nombreDia = "Sábado";
	        break;
	    case 7:
	        nombreDia = "Domingo";
	        break;
	   
	}
	System.out.println("Hoy es " + nombreDia);
	
	
//	1. Crea un programa que dado el valor de una variable numérica entre 1 y 12 imprima el valor 
//	   textual del mes con el que se corresponde, en caso de que el número no sea ninguno de ellos 
//	   imprimirá no entiendo.
//    1. Hazlo primero utilizando sentencias if - else
	int numeroMes = 4;
	String nombreMes;
	
	if(numeroMes == 1) {
		System.out.println("El mes 1 corresponde a enero");
	}else if(numeroMes == 2) {
		System.out.println("El mes 2 corresponde a febrero");
	}else  if(numeroMes == 3) {
		System.out.println("El mes 3 corresponde a marzo");
	}else {
		System.out.println("No tenía más ganas de escribir meses");
	}
	
	
//    2. Hazlo a continuación utilizando sentencia  switch
	
	
	switch (numeroMes) {
	case 1:
		nombreMes = "Enero";
		break;
	case 2:
		nombreMes = "Febrero";
		break;
	case 3:
		nombreMes = "Marzo";
		break;
	case 4:
		nombreMes = "Abril";
		break;
	case 5:
		nombreMes = "Mayo";
		break;
	case 6:
		nombreMes = "Junio";
		break;
	case 7:
		nombreMes = "Julio";
		break;
	case 8:
		nombreMes = "Agosto";
		break;
	case 9:
		nombreMes = "Septiembre";
		break;
	case 10:
		nombreMes = "Octubre";
		break;
	case 11:
		nombreMes = "Noviembre";
		break;
	case 12:
		nombreMes = "Diciembre";
		break;

	default:
		nombreMes = "NO VALIDO";
		break;
	}
	System.out.printf("El número %d corresponde al mes de %s", numeroMes, nombreMes);
	
	
	
}
}
