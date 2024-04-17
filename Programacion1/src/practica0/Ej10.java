package practica0;

import java.util.Scanner;
public class Ej10 {

	static int sumatoria(int n) {
		
		int total = 0;
		for (int i = 0; i <= n; i++) {
			total += i;
		}
	return total;
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero entero: ");
		int num = scan.nextInt();
		System.out.println(sumatoria(num));
		
		scan.close();
	}
	
}
