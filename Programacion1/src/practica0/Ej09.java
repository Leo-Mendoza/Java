package practica0;

import java.util.Scanner;
public class Ej09 {

	static void imprimirFecha(int dia, int mes, int año) {
		String[] listaMeses = {"","Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		System.out.println(dia+" de "+listaMeses[mes]+" del "+año);
		
	}
	
	public static void main (String args[]){
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("Day: ");
		int day = scan.nextInt();
		
		System.out.println("Month: ");
		int month = scan.nextInt();
		
		System.out.println("Year: ");
		int year = scan.nextInt();
		
		imprimirFecha(day,month,year);
		
		scan.close();
	}
	
}