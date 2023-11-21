     package todos;
import java.util.Scanner;
import java.util.Locale;
public class Raiz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		double delta = Math.pow(B, 2) - (4*A*C);
		double R1 = (-B + Math.sqrt(delta))/(2*A);
		double R2 = (-B - Math.sqrt(delta))/(2*A);
		
		if (delta < 0) {
			System.out.println("Não existem raízes reais para equação");
		}else if (delta == 0) {
			System.out.println("Existe apenas uma raiz real para equação");
		}else {
			System.out.println("Existem duas raízes reais para a equação");
		}
		ler.close();
	}
}