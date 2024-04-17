package practica0;

public class Ej33 {
	
	public static int mcd(int a, int b) {
		
		if (a%b ==0) return b;
		
		else {
			
			return mcd(b,a%b);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(mcd(36,20));
	
	}
}
