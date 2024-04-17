package practica0;

import java.util.Scanner;
public class Ej11 {

	static int sumatoriaPares(int n) {
		int i = 2;
		int suma = 0;
		while (i <= n) {
			
			if (i%2 == 0) {
				suma += i;
			}
			
			i += 1;
		}
		
		return suma;
	}
		
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingresa un numero mayor a 2");
			int num = scan.nextInt();
			
			System.out.println(sumatoriaPares(num));
			scan.close();
		}
}