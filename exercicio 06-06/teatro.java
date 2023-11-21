package lista0606;
import java.util.Scanner;
public class teatro {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int ingr, valor, estu;
	
	
	System.out.println("Insira o valor do Ingresso:");
	ingr = sc.nextInt();
	
	System.out.println("Você é um estudante?" + "Digite 1 p/ SIM e 2 p/ NÃO");
	estu = sc.nextInt();
	
	if(estu == 1) {
		valor = ingr/2;
		System.out.println("O valor do seu ingresso é " + valor);
	}else {
		System.out.println("Você não recebe desconto");
	}
	sc.close();
	}
}
