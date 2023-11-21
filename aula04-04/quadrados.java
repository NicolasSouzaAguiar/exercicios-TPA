package exercicios1;
import java.util.Scanner;
public class quadrados {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int a,b,c,quad1,quad2,quad3,resultado;
			
		System.out.println("Entre com o primeiro Quadrado:");
		a = ler.nextInt();
		System.out.println("Entre com o segundo Quadrado:");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro Quadrado:");
		c = ler.nextInt();
		
		quad1 = a*a;
		quad2 = b*b;
		quad3 = c*c;
		resultado = quad1 + quad2 + quad3;
		System.out.println("Resultado da soma dos Quadrados: " + resultado);
		}
}
