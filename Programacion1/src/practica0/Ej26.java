package practica0;

public class Ej26 {

	public static int maximoIndice(int[]a) {
		
		int maxInt = a[0];
		int posMaxInt = 0;
		
		for (int i = 0; i<a.length;i++) {
			if (a[i]>maxInt) {
				
				maxInt = a[i];
				posMaxInt = i;
			}
		}
		return posMaxInt;
	}
	
	public static void main(String[] args) {
		
		int[] a = {0,324,2,56,16};
		
		System.out.println(maximoIndice(a));
	}
}