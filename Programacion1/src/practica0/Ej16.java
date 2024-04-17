package practica0;

import java.util.Scanner;
public class Ej16 {

	public static String backwards(String a) {
		
		String nueva = "";
		
		for (int i = 0; i < a.length(); i++) {
			nueva = a.charAt(i) + nueva;
		}
		return nueva;
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		System.out.print(backwards(cadena));
		scan.close();
	}
	
}
