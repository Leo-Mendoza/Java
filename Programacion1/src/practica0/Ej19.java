package practica0;

public class Ej19 {
	
public static int dameIndice(String[] a, char x) {
		
		int pos = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == x+"") {
				pos = i;
			}
		}
		return pos;
	}

	public static boolean esAbecedaria(String s) { 
		
		String word = s.toLowerCase();
		
		char parametro = word.charAt(0); 
		String nCad = "";
		
		for (int i = 0; i<word.length(); i++) {
			
			if(word.charAt(i) >= parametro) {
				
				nCad = nCad + word.charAt(i);
				parametro = word.charAt(i);
			}
		}
		
		if (word.equals(nCad)) {
			return true;
		}
		
		else {
			return false;
		}
	}
		
	public static void main(String[] args) {
		
		
		System.out.println(esAbecedaria("Agil"));

	}

}