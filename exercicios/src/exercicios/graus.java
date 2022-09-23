package exercicios;


import java.util.Scanner;
import java.util.Locale;

public class graus {
	public double t;
	
	public double kelvin () {
		
		double k = (t + 273.15);
		
		return k;
		
	}
	
	public double reaumu() {
		
	double	r = (t*0.8);
	
	return r; 
	}
	
	public double rankine() {
		
		double ra = (t*1.8+32+459.67);
		
		return ra;
	}
	public double fahrenheit () {
		
		double f = (t*1.8 +	32);
		
		return f;
	}
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		graus v1 = new graus();
		
		
		System.out.println("Qual a temperatura em graus?:\n");
		v1.t = s.nextDouble();
		s.nextLine();
		
		System.out.println("A temperatura em kelvin eh: "+v1.kelvin());
		System.out.println("A temperatura em reaumu eh: "+v1.reaumu());
		System.out.println("A temoeratura em rankine eh: "+v1.rankine());
		System.out.println("A temperatura em fahrenheit eh: "+v1.fahrenheit());
		
		
		
		
	}

}
