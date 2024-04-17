package practica0;

import java.util.Scanner;
public class Ej06y07 {
	// EJ06
		static void imprimirSuma(int a, int b) {
			System.out.println("La suma es: "+ (a + b));
		}
		//EJ07
		static void imprimirPromedio(int c, int d) {
			System.out.println("El promedio es: "+(c+d)/2);
		}
		
		public static void main (String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingresa un numero: ");
			int num1 = scan.nextInt();
			System.out.println("Ingresa otro numero: ");
			int num2 = scan.nextInt();
			
			imprimirSuma(num1,num2);
			scan.close();
		}
}