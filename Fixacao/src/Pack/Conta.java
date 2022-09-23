package Pack;
import java.util.Scanner;

public class Conta {
	
	private double numConta;
	private String Nome;
	public double valor;
	public int n1;
	public float saldo;
	
	
	
	
	

	public Conta() {
System.out.println("Construtor de conta:");

		
	}
	public double getNumConta() {
		return numConta;
		
	}
	
	public void setNumConta(double nc) {
		numConta = nc;
	}
	public void setNome(String Nomee) {
		Nome = Nomee;
	}
	public String getNome() {
		return Nome;
	}

	public void setValor(float value) {
		valor = value;
		}
	public double getValor() {
		return valor;
	}
	
	public void setDados() {
		Conta v2 = new Conta();
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("\nQual o seu nome?: ");
		v2.Nome = s.next();
		
		System.out.println("Qual o numero da sua conta?:");
		v2.numConta = s.nextDouble();
		
		
		System.out.println("Se deseja adicionar um valor a sua conta digite 1:");
		v2.n1 = s.nextInt();
		if(v2.n1 == 1) {
			System.out.println("Qual valor vc deseja adicionar?:");
			v2.saldo = s.nextFloat();
			
			
		}
		
		}
		
		catch(Exception e) {
			System.out.println("\nO numero da sua conta eh invalido!");
			System.out.println("Nao foi possivel criar sua conta.");
			
		}
		
		finally {
			System.out.println("\nO numero da sua conta eh "+ v2.numConta);
			System.out.println("O seu saldo ficou: "+ v2.saldo);
			System.out.println("O seu nome eh: "+ v2.Nome);
			System.out.println("O processo foi finalizado.");
			
		}
		
	
		
	}
}

