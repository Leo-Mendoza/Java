package practica0;

public class Ej25 {

	public static int maximo(int[] a) {
		
		int parametro = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] >= parametro) {
				parametro = a[i];
			}
		}
		return parametro;
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {0,1,2,3,4,5};
		
		System.out.println(maximo(numeros));
		
	}

}

