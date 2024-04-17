package practica0;

import java.util.Scanner;
public class Ej15 {
	
	public static boolean esDivisible(int n, int m) {
		
		if (n % m == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if (esDivisible(n1,n2)) {
			System.out.println(n1+" es divisible por "+n2);
		}
		
		else {
			System.out.println(n1+" no es divisible por "+n2);
		}
		scan.close();
	}
}