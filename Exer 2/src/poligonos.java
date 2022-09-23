import java.util.Scanner;
public class poligonos {
	
	public double A;
	public double B;
	public double C;
	
	
	public double Area() {
		
		double ar = A * C/2;
		
		return ar;
	}
	
	public double circulo () {
		
		double c =2*3.14159*C;
		
		return c;
	}
	
	public double trapezio() {
		
		double t = (A + B) * C/2;
		
		return t;
	}
	public double quadrado() {
		
		double q = B * B;
		
		return q;	
	}
	
	public double retangulo() {
	
	double r = B * A;
	
	return r;
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		poligonos v1 = new poligonos();
		
		System.out.println("De um valor A:\n");
		v1.A =s.nextDouble();
		
		s.nextLine();
		
		System.out.println("De um valor B:\n");
		v1.B =s.nextDouble();
		
		s.nextLine();
		
		System.out.println("De um terceiro valor C:\n");
		v1.C =s.nextDouble();
		
		s.nextLine ();
		
		System.out.printf("ll");
		System.out.println("A Area do triangulo eh: "+v1.Area());
		System.out.println("A area do circulo eh: "+v1.circulo());
		System.out.println("A area do trapezio eh: "+v1.trapezio());
		System.out.println("A area do quadrado eh: "+v1.quadrado());
		System.out.println("A area do retangulo eh: "+v1.retangulo());
		
		
		
		
		
		

	}

}
