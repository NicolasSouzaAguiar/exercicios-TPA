import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[] args) {
		//2) Criar um programa que leia o ano atual e o ano de nascimento de um
		//usu�rio. Calcule e apresente a sua idade, informando se � maior ou
		//menor de idade. Executar o programa at� que o usu�rio responda 2 �
		//pergunta:
		//Deseja continuar a execu��o? (1-para SIM ou 2-para N�O)
		Scanner sc = new Scanner(System.in);
		int aN, id, r;
		do {
			System.out.println("Digite o ano atual:");
	        int aA = sc.nextInt();
			System.out.println("Insira seu ano de Nascimento:");
			aN = sc.nextInt();
			id = aA-aN;
			if(id > 18) {
				System.out.println("Voc� � maior de idade");
			}else {
				System.out.println("Voc� � menor de idade");
			}
			System.out.println("Voc� deseja continuar a execu��o: (1-para SIM e 2-para N�O)");
			r = sc.nextInt();
			
		}while (r == 1);	
			
		sc.close();
	}
	
}
