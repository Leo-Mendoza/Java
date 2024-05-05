package Objetos;

public class Fecha {
	
	int dia;
	int mes;
	int año;
	
	public Fecha() {
		this.dia = 0;
		this.mes = 0;
		this.año = 0;
	}
	
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.año = a;
	}
	
	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.año); 
	}
	
	public boolean esVerano() {
		
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
	
	public void avanzarDia() {
	
		if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia == 31) {
			
			this.dia = 1;
			this.mes = mes + 1;
		}
		
		else if((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10) && this.dia == 30) {
			
			this.dia = 1;
			this.mes = mes + 1;
			
		}
		
		else if (this.dia==30 && this.mes == 12) {
			this.dia = 1;
			this.mes = 1;
			this.año = año + 1;
		}
		
		else this.dia += 1;
		
	}
		
	
	public boolean antesQue(Fecha a) {
		
		if (this.año < a.año) return true;
		
		else if (this.año == a.año && this.mes < a.mes) return true;
		
		else if (this.año == a.año && this.mes == a.mes && this.dia <a.dia) return true;
		
		else return false;
	}
	
	public int diaDelAnio() { 

		int acum = 0;
		for(int i = 1; i<= 12; i++) {
			
			if (i <= this.mes) {
				
				if(i == 1) acum += 0;
				
				if (i == 2) acum += 30;
				
				if(i == 3) {
					
					if (biciesto(this.año)) {
						acum += 29;
					}
					
					else {
						acum += 28;
					}
				}
				
				if (i== 4) acum += 30;
				
				if(i==5) acum += 31;
				
				if (i==6) acum += 30;
				
				if (i==7) acum += 31;
				
				if (i ==8) acum+=30;
		
				if (i == 9) acum +=30;
				
				if (i ==10) acum+= 31;
				
				if (i==11) acum += 30;
				
				if (i==12) acum += 31;
			}
		}
		
		return acum += this.dia;
	}	
	
	public int diasDeDiferenciaCon(Fecha a) {
		
		int dif = 0;
		
		if (this.diaDelAnio() > a.diaDelAnio()) {
			dif =  this.diaDelAnio() - a.diaDelAnio();
	
		}
		
		else if (a.diaDelAnio() > this.diaDelAnio()) {
			dif = a.diaDelAnio() - this.diaDelAnio();
		}
		
		return dif;
	}
	
	
	
	public static void main(String args[]) {
		
		Fecha san_valentin = new Fecha(14,02,2024);
		
		san_valentin.diaDelAnio();
		
		Fecha independence_day = new Fecha(04,07,2024);
		
		System.out.println(independence_day.diasDeDiferenciaCon(san_valentin));
	}
}





	

