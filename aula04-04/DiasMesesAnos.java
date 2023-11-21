package exercicios1;
import java.util.Scanner;
public class DiasMesesAnos {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dias,meses,anos;
		
		System.out.println(" Entre com a contagem de dias:");
		dias = ler.nextInt();
		
			meses = dias/30;
		
		System.out.println("dias em meses = " + meses);
				
					
	}	
		
}
