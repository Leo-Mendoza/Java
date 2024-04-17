package practica0;

import java.util.Scanner;
public class Ej08 {
	static void ponerNota(double x, double y) {
		double prom = (x + y) / 2;
		
		if (prom >= 7) { 
			System.out.println("Promocionado");
		}
		
		else if (prom >= 4) {
			System.out.println("Aprobado");
		}
		
		else if (prom < 4) {
			System.out.println("Debe recuperar");
		}
	}
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la primera nota: ");
		double num1 = scan.nextDouble();
		System.out.println("Ingresa la segunda nota: ");
		double num2 = scan.nextDouble();
		
		ponerNota(num1,num2);
		scan.close();
	}
}