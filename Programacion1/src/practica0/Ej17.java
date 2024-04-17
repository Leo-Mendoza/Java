package practica0;

import java.util.Scanner;
public class Ej17 {
	
	public static int cantidadApariciones(String s, char c) {
		
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				cont +=1;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra: ");
		String palabra = scan.nextLine().toLowerCase();
		
		System.out.println("Ingresa una letra: ");
		char letra = scan.nextLine().toLowerCase().charAt(0);
		
		System.out.println("La letra "+letra+" aparece "+cantidadApariciones(palabra,letra)+" veces en "+palabra);
		scan.close();
	}

}