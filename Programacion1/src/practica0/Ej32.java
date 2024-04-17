package practica0;

public class Ej32 {
	
	public static void collatz(int n) {
		
		if (n==1) {
			System.out.println(n);
			System.out.println ("fin de la secuencia");
		}
		
		else {
			
			if (n%2== 0 && n != 0) {
				System.out.println(n);
				collatz(n/2);
			}
			
			else {
				System.out.println(n);
				collatz((3*n)+1);
			}
		}
	}
	
	public static void main(String[] args) {
		collatz(7);

	}

}
