package practica0;

import java.util.Scanner;

public class Ej03 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int num1 = scan.nextInt();
		System.out.println("Ingresa otro numero: ");
		int num2 = scan.nextInt();
		System.out.println("La suma es: " + (num1+num2));
		
		scan.close();
	}
}