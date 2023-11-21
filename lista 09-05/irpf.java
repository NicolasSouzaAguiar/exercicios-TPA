package todos;
import java.util.Scanner;
public class irpf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sala;
		double irpf;
		
		System.out.println("Digite seu salario:");
		sala = sc.nextInt();
		
		if (sala > 3582) {
			irpf = ((sala*27.5)/100)-662.94;
			System.out.println("Seu desconto é de:" + irpf);
		}else if (sala >= 2866 && sala <= 3582) {
			irpf = ((sala*22.5) / 100)-483.84;
			System.out.println("Seu desconto é de:" + irpf);
		}else if (sala >= 2150 && sala <= 2866) {
			irpf = ((sala*15.0)/100)-268.84;
			System.out.println("Seu desconto é de:" + irpf);
		}else if (sala >= 1434 && sala <= 2150) {                     
			irpf = ((sala*7.5)/100)-107.59;
			System.out.println("Seu desconto é de:" + irpf);
		}else {
			System.out.println("Não nenhum desconto");
		}
		sc.close();
	}
}
