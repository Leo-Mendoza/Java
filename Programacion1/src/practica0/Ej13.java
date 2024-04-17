package practica0;

public class Ej13 {
	
	public static double factorial(int n) {
		
		double resultado = 1;
		for (int i = 1; i <= n; i++) {
			if (n==0) return 1;
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(factorial(num));	
	}
}