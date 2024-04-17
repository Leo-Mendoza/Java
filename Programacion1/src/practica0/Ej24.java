package practica0;

//MAL REALIZADO 
public class Ej24 {
	
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
	
	public static boolean dobleCapicua(String s) {
		
		String parametro1 = "";
		String parametro2 = "";
		
		for (int i = 0; i<s.length(); i++) {
			
			if (!esCapicua(parametro1)) {
				parametro1 += s.charAt(i);
			}
			
			else parametro2 += s.charAt(i);
		}
		
		if (esCapicua(parametro1) && esCapicua(parametro2)) {
			
			return true;
		}
		
		else return false;
	}

	public static void main(String[] args) {
		
		System.out.println(dobleCapicua("neuquenoro"));

	}

}