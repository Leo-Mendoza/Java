package practica0;

import java.util.Scanner;
public class Ej14 {

	public static int cantCifras(int n) {
		
		String numeroStr = "" + n;
		
		System.out.println(numeroStr);
		
		int acum = 0;
		for (int i = 1; i<=numeroStr.length(); i++) {
			
			acum = i;
			System.out.println(acum);
		}
		return acum;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("El numero " + num + " tiene " + cantCifras(num) + " cifras.");
		scan.close();
	}

}