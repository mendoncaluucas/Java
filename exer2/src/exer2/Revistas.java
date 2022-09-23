package exer2;
import java.util.Scanner;
import java.util.Locale;
public class Revistas {
	public String nome;
	public String colecao;
	public int data;
	public String nome2;
	public int telefone;
	public String origem;
	
	


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		Revistas v1 = new Revistas();
		
		
		System.out.println("Qual o seu nome?:");
		v1.nome2 = s.next();
		s.nextLine();
		System.out.println("Qual o seu telefone?:");
		v1.telefone = s.nextInt();
		s.nextLine();
		System.out.println("Qual a sua origem?:");
		v1.origem = s.next();
		System.out.println("Qual o nome da revista?:");
		v1.nome = s.next();
		s.nextLine();
		System.out.println("Qual a colecao?:");
		v1.colecao = s.next();
		s.nextLine();
		System.out.println("Qual a data?:");
		v1.data = s.nextInt();
		
		System.out.println("Nome - "+v1.nome);
		System.out.println("Telefone - "+v1.telefone);
		System.out.println("Origem - "+v1.origem);
		System.out.println("Revista - "+v1.nome2);
		System.out.println("Colecao - "+v1.colecao);
		
		if(v1.data<10) {
			System.out.println("A revista esta indisponivel.");
		}
		else {
			System.out.println("A revista esta disponivel.");
		}
		
		
		
		
		

	}

}
