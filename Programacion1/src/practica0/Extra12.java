package practica0;

import java.util.Scanner;

public class Extra12 {

	static double potencia(double x, int a) {
		
		int i = 1;
		double acum = x;
		while (i<= a-1) {
			
			acum = acum * x;
			System.out.println("iteracion " + i+ ": " + acum);
			i ++;
			
		}
		
		return acum;
	}
	
	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa una fraccion base ( a/b ): ");
		String baseStr = scan.nextLine();
		
		System.out.println("ingresa un exponente: ");
		int exp = scan.nextInt();
		
		int i = 0;
		char n1Char = '1';
		char n2Char = '2';
		
		while (i<= baseStr.length()) {
			
			if (i == 0) {
				
				n1Char = baseStr.charAt(i);
			}
			
			if (i==2) {
				
				n2Char = baseStr.charAt(i);
			}
			
			i += 1;
		}
		
		System.out.println(n1Char+ " "+ n2Char);
		
		int n1Int = Character.getNumericValue(n1Char);
		int n2Int = Character.getNumericValue(n2Char);
		
		
		double n1Double = (double) n1Int;
		double n2Double = (double) n2Int;
		
		double baseDouble = n1Double / n2Double;
		
		System.out.println(baseDouble+ " "+ exp);
		
		System.out.println(potencia(baseDouble, exp));
		
		scan.close();
	}
} 