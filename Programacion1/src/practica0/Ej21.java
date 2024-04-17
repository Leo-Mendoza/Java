package practica0;

public class Ej21 {
	
	public static boolean esSinRepetidos(String s) {
		
		String word = s.toLowerCase();
		
		for (int i = 0; i<word.length(); i++) {
			
			for(int j = i+1; j<word.length(); j++) {
				
				if (word.charAt(i) == word.charAt(j)) {
					return false;
				}
			}	
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	
		System.out.println(esSinRepetidos("abcdefg"));
		
	}

}