package lista0606;
import java.util.Scanner;
public class Produtos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int preco;
		double desc,fina;
		
		System.out.println("Apresente o valor do produto");
		preco = sc.nextInt();
		
		if(preco > 100 && preco < 500) {
			desc = 0.05*preco;
			fina = preco-desc;
			System.out.println("Valor final: " + fina);
		}else if (preco > 500 && preco < 1000) {
			desc = preco*0.1;
			fina = preco-desc;
			System.out.println("Valor final: " + fina);
		}else if (preco > 1000 && preco < 2000) {
			desc = preco*0.15;
			fina = preco-desc;
			System.out.println("Valor final: " + fina);
		}else if (preco > 2000) {
			desc = preco*0.2;
			fina = preco-desc;
			System.out.println("Valor final: " + fina);
		}else {
			System.out.println("Seu produto não recebe Desconto /:");
		}
		sc.close();
	}
}
