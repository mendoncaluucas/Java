package Pack;
import java.util.Scanner;
import java.util.Locale;
public class idade {

	public double SoAno;
	public int ano;
	public double ConMeses;
	public int meses;  
	public int dias;
	public int n1;
	
	
	
	public double somaAno () {
		double s = SoAno * ano;
		return s;
		
	}
	
	public double somaMeses () {
		
		double a = ConMeses * meses;
		return a;
		
	}
	
	public double somaDias () {
		
		double b = somaMeses() + somaAno() + dias;
		return b;
	}

	
	public void setDados() {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		idade v1 = new idade();
		
		ano = 365;
		meses = 30;
		dias = dias;
		
		System.out.println("Quantos anos vc tem?");
		v1.somaAno();
		v1.SoAno = s.nextDouble();
		
		System.out.println("Quantos meses?");
		v1.somaMeses();
		v1.ConMeses = s.nextInt();
		
		System.out.println("Quantos dias?");
		v1.dias = s.nextInt();
		System.out.println("// ---------------------------- //");
		System.out.println(" Se deseja mostrar os dados que vc inseriu digite 1");
		v1.n1 = s.nextInt();
		
		if(v1.n1 == 1) {
		System.out.println("Anos == " +v1.SoAno);
		
		System.out.println("Meses == "+v1.ConMeses);
		
		System.out.println("Dias == "+v1.dias);
		
		}
		System.out.println("// ------------------------------ //");
			System.out.println("Sua idade em dias eh "+somaDias());
		System.out.println("// ------------------------------ //");
		
		
		
	}

}
