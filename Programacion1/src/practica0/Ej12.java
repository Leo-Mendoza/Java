package practica0;

import java.util.Scanner;

public class Ej12 {

	static double potencia(double x, int a) {
		
		double resultado = x;
		for (int i = 1; i<=a-1;i++) {
			
			resultado = resultado * x;
			
		}
		return resultado;
	}
	
	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa una fraccion base ( a/b ): ");
		double base = scan.nextDouble();
		
		System.out.println("ingresa un exponente: ");
		int exp = scan.nextInt();
		
		System.out.println(potencia(base, exp));
		
		scan.close();
	}
}