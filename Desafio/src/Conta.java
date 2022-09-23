import java.util.Scanner;
import java.util.Locale;

public class Conta {
	protected double numconta;
	public String nome;
	public float valorDeposito;
	public double saque;
	public double saldo;
	public int num1;
	public int num2;
	
	public void saldo1 (double valorDeposito) {
		this.saldo += valorDeposito;
	}
	public void saque1 (double valorDeposito) {
		
		this.saldo -= saque - (-5);
	}
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		Conta v1 = new Conta();
		
		
		System.out.println("Qual o numero da sua conta?: ");
		v1.numconta = s.nextDouble();
		s.nextLine();
		
		
		System.out.println("Qual o seu nome?:");
		v1.nome = s.next();
		s.nextLine();
		
		System.out.println("Se deseja adicionar um deposito inicial digite 1.");
		v1.num1 = s.nextInt();
		
		if(v1.num1 == 1) {
			
			System.out.println("Qual o valor a ser depositado?: ");
			double b = s.nextFloat();
			v1.saldo1(b);
			System.out.println("O numero da sua conta eh: "+v1.numconta);
			System.out.println("O seu nome eh: "+v1.nome);
			System.out.println("O seu novo saldo eh: "+v1.saldo);
			
			
		}
		
		System.out.println("Se deseja realizar um saque digite 2.");
		v1.num2 = s.nextInt();
		s.nextLine();
		
		
		if(v1.num2 == 2) {
			System.out.println("Qual o valor que deseja sacar?:");
			double a = s.nextDouble();
			v1.saque1(a);
			
			System.out.println("O numero da sua conta eh: "+v1.numconta);
			System.out.println("O seu nome eh: "+v1.nome);
			System.out.println("O seu saldo eh: "+v1.saldo);
			
			
		}
		
		
		
		
		
		
	}

}
