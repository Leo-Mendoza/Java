package practica0;

public class Ej23 {
	
	public static boolean cruzadas(String a, String b, String c) {
		
		/* se crean las variables que contendran las posiciones 
		   ademas se crean las variables auxiliares en caso de que una palabra 
		   pueda estar en 2 pisiciones de b */
		
		int posAxB = 0;
		int posAxBaux = 0;
		int posCxB = 0;
		int posCxBaux = 0;
	
		// recorrer b para saber si contiene alguna letra de a
		
		for (int i = 0; i<b.length(); i++) {
			
			for (int j = 0; j<a.length(); j++) {
				
				// si hay un caracter de b repetido en a devolver posicion en b
				
				if(b.charAt(i)==a.charAt(j)) {
					
					if(posAxB == 0) {
						posAxB = i;
					}
					
					else posAxBaux = i;
				}
				
			}
			
		}
		
		// recorrer b para saber si contiene alguna letra de c
		
		for (int i = 0; i<b.length(); i++) {
			
			for (int k =0; k<c.length(); k++) {
				
				// si hay un caracter de b repetido en c devolver posicion en b
				
				if(b.charAt(i)==c.charAt(k)) {
					if(posCxB == 0) {
						posCxB = i;
					}
					else posCxBaux = i;
				}
			}
		}
		
//		 si la posicion de a, ya sea en su variable normal o auxiliar, esta por encima de la posicion de c
		
		if (posAxB < posCxB || posAxB < posCxBaux || posAxBaux < posCxB || posAxBaux < posCxBaux ) {
			
			// 	si la posicion de c se encuentra al menos un renglon por encima 
			
			if(posCxB >= posAxB +2 || posCxB >= posAxBaux +2 || posCxBaux >= posAxB+2 || posCxBaux >= posAxBaux+2) {
				
				return true;
				
			}
			else return false;
		}
	
		else return false;
		
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(cruzadas("jugo","bueno","anana"));

	}
}