package todos;
import java.util.Scanner;
public class fahrenheit {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double f,c;
		
		System.out.println(" Insira o valor da temperatura em Fahrenheit:");
		f = ler.nextInt();
		
		c = (f-32)/1.8;
		System.out.println("Celsius:" + c);
		
		if (c >= 22) {
			System.out.println("Calor");
		}else if (c >= 15 && c <= 22  ) {
			System.out.println("Ameno");
		}else {
			System.out.println("Frio");
			
		}
	}
	
	
}
