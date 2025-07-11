package _01_operadores_artimeticos;

public class Entrenamiento {

 public static void main(String[] args) {
	int a = 8, b = 3, c = -5;
	
	System.out.printf("Operaciones aritmeticas con int");
	System.out.printf("%n-------------------------------%n");
	System.out.printf("a) a + b + c = %d%n", a + b + c);
	System.out.printf("b) 2 * b + 3 * (a - c) = %d%n", 2 * b + 3 * (a - c));
	System.out.printf("c) a / b = %d%n", a / b);
	System.out.printf("d) a %% b = %d%n", a % b);
	System.out.printf("e) a / c = %d%n", a / c);
	System.out.printf("f) a %% c = %d%n", a % c);
	System.out.printf("g) a * b / c = %d%n", a * b / c);
	System.out.printf("h) a * (b / c) = %d%n", a * (b / c));
	System.out.printf("i) (a * c) %% b = %d%n", (a * c) % b);
	System.out.printf("j) (a * c) %% b = %d%n", (a * c) % b);
	System.out.printf("k) ((3 * a - 2 * b) %% (2 * a - c) = %d%n", (3 * a - 2 * b) % (2 * a - c));
	System.out.printf("l) 2 * ( a / 5 + (4 - b * 3)) %% (a + c - 2) = %d%n", 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2));
	
	char c1 = 3;
	char c2 = '5';
	System.out.printf("%nOperaciones con char");
	System.out.printf("%n--------------------%n");
	System.out.println(c1 += c2);
	
	System.out.printf("%nOperaciones con long");
	System.out.printf("%n--------------------%n");
	
	long l1 = Long.MAX_VALUE;
	System.out.printf("Valor máximo de long: %d%n",l1);
	
	long l2 = Long.MIN_VALUE;
	System.out.printf("Valor minimo de long: %d%n",l1);
	
	System.out.printf("%nOperaciones con float");
	System.out.printf("%n--------------------%n");
	
	float f1 = Float.MAX_VALUE;
	System.out.printf("Valor máximo de float: %d%n",l1);
	
	float f2 = Float.MIN_VALUE;
	System.out.printf("Valor minimo de float: %d%n",l1);
	
	
	System.out.printf("%n1. Operadores incremento y decremento");
	System.out.printf("%n----------------------------------%n");
	char A = 'c';
	char B;
	
	System.out.println("Imprime:'c'");
	System.out.println("Valor a:'d'");
	System.out.println(A++);
	
	
	System.out.println("Imprime:'d'");
	System.out.println("Valor a:'e'");
	System.out.println(A++);
	
	System.out.println("Imprime:'f'");
	System.out.println("Valor a:'f'");
	System.out.println(++A);
	
	System.out.println("Valor b:'e'");
	System.out.println("Valor a:'e'");
	B = --A;
	
	System.out.println("Imprime:'f'");
	System.out.println("Valor a:'f'");
	System.out.println(++A);
	
	System.out.println("Imprime:'f'");
	System.out.println("Valor a:'g'");
	A++; 
	
	System.out.println("Valor b:'d'");
	--B;
	
	System.out.println("Imprime:'d'");
	System.out.println("Valor b:'e'");
	System.out.println(B++);
	
	System.out.println("Imprime:'f'");
	System.out.println("Valor b:'f'");
	System.out.println(++B);
	
	System.out.println("Imprime:'h'");
	System.out.println("Valor a:'h'");
	System.out.println(++A);
	
	System.out.println("Imprime:'f'");
	System.out.println("Valor b:'e'");
	System.out.println(B--);
	
	System.out.printf("El valor de A es 'h'%n");
	System.out.printf("Java dice que el valor de A es %c%n", A);
	
	System.out.printf("El valor de B es 'e'%n");
	System.out.printf("Java dice que el valor de B es %c%n", B);
	
	char c4 = 20695; 
	System.out.println(c4);
	
	char c5 = 20874; 
	System.out.println(c5);
	
	
	System.out.printf("%n1. Operadores incremento y decremento");
	System.out.printf("%n----------------------------------%n");
	//i = i++
	//i = ++i
	int i = 1;
	System.out.printf("i = i++. i es igual a %d%n", i = i++);
	System.out.printf("i = ++i. i es igual a %d%n", i = ++i);
	
	i++;
	++i;
	System.out.printf("La i vale %d%n", i);
	
	//i = i++
	//i = ++i
	int j = 1;
	System.out.printf("%nj = j++. j es igual a %d%n", j++);
	System.out.printf("j = ++j. j es igual a %d%n", ++j);
		
	j++;
	++j;
	System.out.printf("La j vale %d%n", j);
	
	System.out.printf("%nPruebas de operadores entre float y Long");
	System.out.printf("%n-----------------------------------------%n");
	
	long vueltas = 1_000_000L;           
    float distanciaPorVuelta = 42195.5f; 
    
    
    float distanciaTotal = vueltas * distanciaPorVuelta;
    
    System.out.printf("Distancia total recorrida por la nave: %.2f kilómetros.%n", distanciaTotal);
    
    
    
 }
}
