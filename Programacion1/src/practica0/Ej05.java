package practica0;

import java.util.Scanner;

public class Ej05 {

	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		float num1 = scan.nextFloat();
		
		System.out.println("Ingresa otro numero: ");
		float num2 = scan.nextFloat();
		
		System.out.println("El promedio es: " + ((num1 + num2)/2));
		scan.close();
	}
}