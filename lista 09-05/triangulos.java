package todos;
import java.util.Scanner;
public class triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("introduza os valores");
		System.out.println("A=");
		a = sc.nextInt();
		System.out.println("B=");
		b = sc.nextInt();
		System.out.println("C=");
		c = sc.nextInt();
		
		if ((a < b+c) && (b < a+c) && (c < a+b)) {
			if ((a == b) && (b==c)){
				System.out.println("Seu triangulo é Equilatero");
			}else if ((a != b) && (b != c) && (a != c)){
				System.out.println("Seu triangulo é um Escaleno");
			}else {
				System.out.println("Seu triangulo é um Isóceles");
			}
		}else {
			System.out.println("Não é um triangulo");
		}
		sc.close();           
	}
}
