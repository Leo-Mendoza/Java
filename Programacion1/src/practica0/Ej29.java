package practica0;

public class Ej29 {
	
	public static double promedio(double[] a) {
		
		double suma = 0;
		for (int i = 0; i<a.length; i++) {
			
			suma += a[i];
		}
		
		
		
		double resultado = suma / a.length;
		return resultado;
	}
	
	public static void main(String[] args) {
		
		double[] numeros = {1.1,1.2,1.3,1.4,1.5};
		
		System.out.println("el promedio es: " + promedio(numeros));
	}
}