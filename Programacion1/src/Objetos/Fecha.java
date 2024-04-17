package Objetos;

public class Fecha {
	
	int dia;
	int mes;
	int año;
	
	
	public Fecha() {
		int dia = 0;
		int mes = 0;
		int año = 0;
	}
	
	
	public Fecha(int d, int m, int a) {
		int dia = d;
		int mes = m;
		int año = a;
	}
	
	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.año); 
	}
	
	boolean esVerano() {
		
		if(this.mes == 1|| this.mes == 2) return true;
		
		else if (this.mes == 3 && this.dia < 21) return true;
		
		else if (this.mes == 12 && this.dia >= 21) return true;
		
		else return false;	
	}
	
	public static boolean biciesto(int año) {
		if(año%4 == 0 && año%100 == 0) return true;
		
		else if (año%400 == 0) return true;
		
		else return false;
	}
	
	public static void biciestosHasta(int año) {
		
		for(int i = 1; i <= año; i++) {
			
			if(biciesto(i)) System.out.println("\\nEl año "+i+" es biciesto");
			
			else System.out.println("\nEl año " +i+ " no es biciesto");
			
		}
	}
	
	public static int diasDelMes(int mes, int año) {
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) return 30;
		
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) return 31;
		
		else if (mes == 2) {
			
			if (biciesto(año)) return 29;
			
			else return 28;
		}
		
		else return -1;
			
	}
	
	public boolean esValida() {
		
		if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
			
			if ( 1 <= this.dia && this.dia<= 30) return true; 
			
			else return false;
		}
		
		else if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			
			if (1 <= this.dia && this.dia <= 31) return true;
			else return false;
		}
		
		else if (this.mes == 2) {
			
			if (biciesto(this.año) && (1 <= this.dia && this.dia <= 29)) return true;
			
			else if (!biciesto(this.año) && (1 <= this.dia && this.dia <= 28)) return true;
			
			else return false;	
		}
		
		else return false;
	}
	
	
	
	}
	

