package exercicios1;
import java.util.Scanner;
public class AeB {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int a,b,c;
	
	System.out.println("entre com o valor de A: ");
	
	a = ler.nextInt();
	
	System.out.println("entre com o valor de B: ");
	
	b = ler.nextInt();
	
	c = a;
	a = b;
	b = c;
	System.out.println("Valores Trocados:");
	System.out.println("Valor de A= " + a);
	System.out.println("Valor de B= " + b);
	}
}
