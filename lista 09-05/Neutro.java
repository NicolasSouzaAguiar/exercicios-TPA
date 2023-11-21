package todos;
import java.util.Scanner;
public class Neutro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um numero:");
		num = ler.nextInt();
		
		if(num >= 1) {
			System.out.println("seu numero é Positivo");
		}else if(num == 0) {
			System.out.println("Seu numero é Neutro");
		}else                                                                                     {
			System.out.println("Seu numero é Negativo");
					
		}
		
	}
}
