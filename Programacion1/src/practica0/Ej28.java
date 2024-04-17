package practica0;

public class Ej28 {
	
	public static boolean estaOrdenado(int[] a) {
		
		int parametro = a[0];
		int acum = 0;
		for (int i = 0; i<a.length; i++) {
			if(parametro <= a[i]) {
				parametro = a[i];
				acum += 1;
			}
		}
		if (acum == a.length) {
			return true;
		}
		
		else return false;
	}

	public static void main(String[] args) {
		
		int[] numeros = {-30,2,3,4,5,6,7}; 
		
		System.out.println(estaOrdenado(numeros));

	}

}
