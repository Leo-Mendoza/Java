package practica0;

public class Ej31 {
	
	public static int fibrec(int n) {
		
		if(n==0) return 0;
		
		if(n==1) return 1;
		
		else return fibrec(n-1) + fibrec(n-2);
	}
	
	public static int fibiter(int n) {
		
		int[] resultados = new int[n+1];
		
		resultados[0] = 0;
		
		if (n==0 || n==1) return n;
		
		for (int i = 1; i<=n; i++) {
			
			if(i ==1) resultados[i] = 1; 
			
			else resultados[i] = resultados[i-2] + resultados[i-1];
		}
		return resultados[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibrec(47));
		System.out.println(fibiter(47));
	}

}

//la razon del output "-1323752223" puede deberse al desbordamiento del tipo de dato int

