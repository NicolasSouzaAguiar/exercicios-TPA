package todos;
import java.util.Scanner;
public class Salário {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int minimo, usuario, valor;
		
		minimo = 1302;
		
		System.out.println("Entre com o valor de seu Salário:");
		usuario = ler.nextInt();
		
		valor = usuario / minimo;
		
		System.out.println("Sua quantia de Salários mínimos é de: " + valor);
		
		if(usuario>=1302) {
			System.out.println("ADEQUADO");
		} else {
			System.out.println("INADEQUADO");
		}
	}
}
