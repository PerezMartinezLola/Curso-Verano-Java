package _01_operadores_artimeticos;

import java.util.Iterator;

public class Bucles {
public static void main(String[] args) {
	//Bucle de 1 a 10
	
	System.out.printf("Bucle de 1 a 10 con while%n");
	System.out.printf("-------------------------%n");
	int contador = 1;
	while(contador <= 10) {
		System.out.println(contador);
		contador++;
	}
	
	System.out.printf("%nBucle de 10 a 1 con while%n");
	System.out.printf("-------------------------%n");
	contador = 10;
	while (contador >= 1) {
		System.out.println(contador);
		contador--;
	}
	
	System.out.printf("%nBucle de 2 a 10 de 2 en 2 con while%n");
	System.out.printf("-------------------------------------%n");
	contador = 2;
	while(contador <= 10) {
		if(contador % 2 == 0) {
			System.out.println(contador);
		}
		contador++;
	}
	
	contador = 10;
	System.out.printf("%nBucle de 10 a 2 de 2 en 2 con while%n");
	System.out.printf("-------------------------------------%n");
	while(contador >= 2) {
		if(contador % 2 == 0) {
			System.out.println(contador);
		}
		contador--;
	}
	
//	a) Entre 50 y 2500 hay XX números múltiplos de 13.
	System.out.printf("%na) Entre 50 y 2500 hay XX números múltiplos de 13.%n");
	
//	Bucle for
	contador = 0;
	
	for (int i = 50; i <= 2500; i++) {
		if(i % 13 == 0) {
			contador++;
		}
	}
	
	System.out.printf("%nHay %d numeros multiplos de 13 entre 50 y 2500 con bucle for.%n", contador);
	
//	Bucle while
	contador = 0;
	int numeroInicio = 50;
	int numeroFinal = 2500;
	while (numeroInicio >= 50 && numeroInicio <= numeroFinal) {
		if(numeroInicio % 13 == 0) {
			contador++;
		}
		numeroInicio++;
	}
	System.out.printf("%nHay %d numeros multiplos de 13 entre 50 y 2500 con bucle while.%n", contador);
	
	
//	b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: XX XX ... XX
	   
	System.out.printf("%nb) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: ");
	int fechaInicio = 1935;
	int fechaFinal = 1812;
	int saltos = 7;
	
	   for (int i = fechaInicio; i > fechaFinal; i-=saltos) {
		System.out.printf("%d ", i);
	}
	   System.out.println();
	
//	c) El producto de los números impares entre 10 y 20 es XX.
	   
	   System.out.printf("%nc) El producto de los números impares entre 10 y 20 es ");
	   
	   int numInicio = 10;
	   int numFinal = 20;
	   int producto = 1;
	  
	   
	   	for (int i = numInicio; i < numFinal; i++) {
			if(i % 2 != 0) {
				producto *= i;
			}
		}
	   	System.out.println(producto);
	   
//	d) La suma de los números entre 70 y 800 es XXX.
	   	
	   	System.out.printf("%nd) La suma de los números entre 70 y 800 es ");
	   	
	   	int suma = 0;
	   	numInicio = 70;
	   	numFinal = 800;
	   	
	   	for (int i = numInicio; i < numFinal; i++) {
			suma +=i;
		}
	   	System.out.println(suma);
	   	
	   	
//	e) Esta es la cadena de texto AAAAAAAAAAAAAAAAAAAAAAAAA y ha sido obtenida concatenando 25 veces la A.
	   	
	   	System.out.printf("%ne) Esta es la cadena de texto ");
	   	char c = 'A';
	   	int numLetras = 25;
	   	
	   		for (int i = 0; i < numLetras; i++) {
				System.out.print(c);
				
			}
	   	System.out.println();
	   	
	  
//	f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
	  
	   System.out.printf("%nf) La suma de los cuadrados de los numeros pares entre 15 y 70 es ");
	   suma = 0;
	   numInicio = 15;
	   numFinal = 70;
	   
	   	for (int i = numInicio; i < numFinal; i++) {
	   		if(i % 2 == 0) {
	   			suma += i*i;
	   		}
		}
	   	System.out.println(suma);
	   	
//	g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
	   	
	   	System.out.printf("%ng) La suma de los cubos de los numeros impares entre -10 y 20 es ");
	   	suma = 0;
	   	numInicio = -10;
	   	numFinal = 20;
	   	
	   		for (int i = numInicio; i < numFinal; i++) {
				if(i % 2 != 0) {
					suma += i * i * i;
				}
			}
	   		
	   		System.out.println(suma);
	   		
//	h) El abecedario inglés de letras minúsculas es: abcdefghijklmnopqrstuvwxyz
	   		
	   	System.out.printf("%nh) El abecedario inglés de letras minúsculas es: ");
	   	char charInicio = 'a';
	   	char charFinal = 'z';
	   	
	   		for (char i = charInicio; i <= charFinal; i++) {
				System.out.print(i);
			}
	   	
	   	System.out.println();
	   	
//	i) El abecedario inglés de letras mayúsculas es:ABCDEFGHIJKLMNOPQRSTUVWXYZ
	   	
	   	System.out.printf("%ni) El abecedario inglés de letras mayúsculas es: ");
	   	charInicio = 'A';
	   	charFinal = 'Z';
	   	
	   		for (char i = charInicio; i <= charFinal; i++) {
				System.out.print(i);
			}
	   		
	   		System.out.println();
	   		
//	j) El abecedario inglés de letras minúsculas de 3 en 3 letras es:adgjmpsvy
	   	
	   	System.out.printf("%nj) El abecedario inglés de letras minúsculas de 3 en 3 letras es: ");
	   	charInicio = 'a';
	   	charFinal = 'z';
	   	saltos = 3;
	   	
	   		for (int i = charInicio; i < charFinal; i+=saltos) {
				System.out.printf("%c", i);
			}
	   System.out.println();

//	k) El abecedario inglés de letras minúsculas alrevés es: zyxwvutsrqponmlkjihgfedcba
	   	
	   	System.out.printf("%nk) El abecedario inglés de letras minúsculas alrevés es: ");
	   	
		   	for (char i = charFinal; i >= charInicio; i--) {
				System.out.print(i);
			}

		System.out.println();
		
//	l) El abecedario inglés alternando mayúsculas y minúsculas es: AbCdEfGhIjKlMnOpQrStUvWxYz
		   	
		 System.out.printf("%nl) El abecedario inglés alternando mayúsculas y minúsculas es: ");
		 
		 int ini = (int)'A';
		 int fin = (int)'Z';
		 boolean esMayuscula = true;
      
		 for(int i = ini; i <= fin; i++){
		     if(esMayuscula)  
		         System.out.print((char)i);
		     else 
		         System.out.print((char)(i+32));
		     esMayuscula = !esMayuscula;
		 }
		 System.out.println();
   
}
}
