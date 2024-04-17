package practica0;

public class Ej22 {
	
	public static String sinRepetidos(String s) {

		String word = s.toLowerCase();
		String nStr = "";
		
		for (int i=0; i<word.length();i++) { 
			
			for(int j = i+1; j<word.length(); j++) {
				
				
				if (word.charAt(i) == word.charAt(j)) {
					
					for (int k = 0; k<word.length(); k++) {
						
						// si k == i entonces agregamos un vacio ""
						
						if (k == i) {
							nStr += "";
						}
						else nStr = nStr + word.charAt(k);	
					}
				}
					
			}	
		}
		return nStr;
	}
		
		
	public static void main(String[] args) {
		
		System.out.println(sinRepetidos("casos"));
		
	}

}