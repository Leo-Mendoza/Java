package practica0;

import java.util.Scanner;
public class Ej18 {
	
	public static int cantidadVocales(String s) {
		
		String vocales = "aeiou";
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			for(int j = 0; j< vocales.length(); j++) {
				
				if(s.charAt(i) == vocales.charAt(j)) {
					cont += 1;
				}
			}
		}
	return cont;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palabra = scan.nextLine().toLowerCase();
		
		System.out.println("En "+palabra+" hay "+cantidadVocales(palabra)+" vocal/es");
		scan.close();
	}
}