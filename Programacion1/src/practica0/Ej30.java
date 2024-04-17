package practica0;

public class Ej30 {
	
	public static int sumatoriaRec(int n) {
		
		if (n==0) 
		{
			return 0;
		}
		
		return n + sumatoriaRec(n-1);
	}
	
	public static int sumatoriaParesRec(int n) {
		
		if (n==0) {
			return 0;
		}
	
		if (n%2==0) {
			return n + sumatoriaParesRec(n-1);
		}
		
		else {
			return sumatoriaParesRec(n-1);
		}
	}

	public static double potenciaRec(double x, int n) {
		
		if (x == 0) return 0;
					
		if (x == 1 || n == 0) return 1;
		
		if (n==1) return x;
		
		else return x * potenciaRec(x,n-1);
		
	}
	
	public static double factorialRec(int n) {
		
		if (n == 0) return 1;
		
		else return n * factorialRec(n-1);
	}
	
	
	public static int cantCifrasRec(int n) {
		
		if (n <10) return 1;
	
		else return 1 + cantCifrasRec(n/10);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sumatoriaRec(5));
		System.out.println(sumatoriaParesRec(4));
		System.out.println(potenciaRec(5.7,0));
		System.out.println(factorialRec(5));
		System.out.println(cantCifrasRec(1782892));
	}
}