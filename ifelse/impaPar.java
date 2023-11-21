package todos;
import java.util.Scanner;
public class impaPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Escreva um numero:");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Seu número é Par");
		} else {
			System.out.println("Seu número é Ímpar");
		}
	}
}
