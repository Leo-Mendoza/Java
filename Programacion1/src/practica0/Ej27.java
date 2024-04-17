package practica0;

public class Ej27 {
	
	public static int suma(int[] a) {
	
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {0,1,2,3,4,5};
		
		System.out.println(suma(numeros));
		
	}

}