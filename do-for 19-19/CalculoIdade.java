import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[] args) {
		//2) Criar um programa que leia o ano atual e o ano de nascimento de um
		//usuário. Calcule e apresente a sua idade, informando se é maior ou
		//menor de idade. Executar o programa até que o usuário responda 2 à
		//pergunta:
		//Deseja continuar a execução? (1-para SIM ou 2-para NÃO)
		Scanner sc = new Scanner(System.in);
		int aN, id, r;
		do {
			System.out.println("Digite o ano atual:");
	        int aA = sc.nextInt();
			System.out.println("Insira seu ano de Nascimento:");
			aN = sc.nextInt();
			id = aA-aN;
			if(id > 18) {
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Você é menor de idade");
			}
			System.out.println("Você deseja continuar a execução: (1-para SIM e 2-para NÃO)");
			r = sc.nextInt();
			
		}while (r == 1);	
			
		sc.close();
	}
	
}
