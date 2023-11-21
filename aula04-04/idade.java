package exercicios1;
import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual,anoNasc,idade;
		
		System.out.println("entre com o Ano Atual");
		anoAtual = ler.nextInt();
		
		System.out.println("entre com o Ano de Nascimento");
		anoNasc= ler.nextInt();
		
		idade = anoAtual - anoNasc;
		System.out.println("Sua idade é " + idade);
	}
}
