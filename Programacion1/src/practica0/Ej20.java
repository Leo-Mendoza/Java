package practica0;

import java.util.Scanner;
public class Ej20 {
	
	public static boolean esCapicua(String s) {
		
		String nCad = "";
		
		for(int i = 0; i <s.length(); i++) {
			nCad = s.charAt(i) + nCad;
		}
		
		if (nCad.equals(s)) 
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String palabra = scan.nextLine();
		
		System.out.println(esCapicua(palabra));
		scan.close();
	}
}