package todos;
import java.util.Scanner;
public class KmL {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int km, l, gasto;
		
		System.out.println("digite a distancia percorrida em KM");
		km = ler.nextInt();
		
		System.out.println("Digite a capacidade do tanque em Litros");
		l = ler.nextInt();
		
		gasto = l/km;
		
		System.out.println("Seu gasto médio é de " + gasto + "KM/L");
		
		if (gasto >= 10) {
			System.out.println("Seu carro é Econômico");
		}else {
			System.out.println("Seu carro não é Econômico");
		}
	}
}
