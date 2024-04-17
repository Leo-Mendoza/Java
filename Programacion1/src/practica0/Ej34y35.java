package practica0;

public class Ej34y35 {
	
	public static String resto(String s) {
		
		String nStr = "";
	
		for (int i = 1; i<s.length();i++) {
			
			nStr += s.charAt(i);
		}
		
		return nStr;
		
	}
	
	//Ej34	
	public static String asteriscos(String s) {
		
		if(s.equals("")) return "";
		
		else {
			
			if (s.length() > 1) return s.charAt(0) + "*" + asteriscos(resto(s));
				
			else return  s.charAt(0) + "" + asteriscos(resto(s));
		}

	}
	
	//Ej35
	public static String noRepCont(String s) {
		
		if (s.length() == 0) return "";
		
		if (s.length() > 1 && s.charAt(0) == s.charAt(1)) return noRepCont(resto(s));
		
		else return s.charAt(0) + noRepCont(resto(s));
	}
	
	public static void main(String[] args) {
		System.out.println(asteriscos("hola"));
		System.out.println(noRepCont("gggeeeeeuddddduu"));
	}

}