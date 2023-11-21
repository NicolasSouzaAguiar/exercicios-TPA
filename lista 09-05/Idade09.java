package todos;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anoAtual,anoNasc,idade;
		
		anoAtual = 2023;
		System.out.println("Insira o seu ano de nascimento:");
		anoNasc = ler.nextInt();
		
		idade = 2023-anoNasc;
		
		System.out.println(" sua idade é:" + idade);
		
		if (idade < 10) {
			System.out.println("você ainda é uma criança");
		}else if(idade >= 10 && idade <=18) {
			System.out.println("Você é um(a) Adolescente");
		}else if(idade >= 18 && idade <=60) {
			System.out.println("Você é um Adulto");
		}else {
			System.out.println("Você é um Idoso");
		}
	}
}
