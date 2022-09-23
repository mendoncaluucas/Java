import java.util.Scanner;
import java.util.Locale;
public class peca {
	public double code;
	public int n1;
	public float valor;
	public double code2;
	public int n2;
	public float valor2;
	public int i1;
	
	public double numPecas () {
		double n = (n1 + n2);
		
		return n;
	}
	
	public double somaValores () {
		
		double s =(n1+valor) + (n2 + valor2) + (valor + valor2);
		
		return s;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		peca v1 = new peca();
		
		System.out.println("Qual o codigo do produto?:");
		v1.code=s.nextDouble();
		s.nextLine();
		System.out.println("Qual o numero de pecas?:");
		v1.n1=s.nextInt();
		s.nextLine();
		System.out.println("Qual o valor da peca?:");
		v1.valor=s.nextFloat();
		System.out.println("Se deseja adicionar mais uma peca digite 1.");
		v1.i1 = s.nextInt();
		if(v1.i1 == 1) {
		System.out.println("Qual o codigo do segundo produto?");
		v1.code2=s.nextDouble();
		s.nextLine();
		System.out.println("Qual o numero de pecas?");
		v1.n2=s.nextInt();
		s.nextLine();
		System.out.println("Qual o valor da segunda peca?:");
		v1.valor2=s.nextFloat();
		}
		else{
			System.out.println("// ---------------------------------- //");
			
			System.out.println("O programa esta encerrado!");
		}
		System.out.println("// -------------------------------------- //");
		System.out.println("O codigo da primeira peca eh: \n"+v1.code);
		System.out.println("O codigo da segunda peca eh: \n"+v1.code2);
		System.out.println("O numero total de pecas que vc comprou foram:\n "+v1.numPecas());
		System.out.println("O valor total a ser pago eh: "+v1.somaValores());
		System.out.println("// -------------------------------------- //");
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
