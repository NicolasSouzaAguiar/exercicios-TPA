package todos;
import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,m,ex,not;
	
		System.out.println("nota1");
		n1 = ler.nextInt();
		System.out.println("nota2");
		n2 = ler.nextInt();
		System.out.println("nota3");
		n3 = ler.nextInt();
		
		m = (n1 + n2 + n3)/3;
		
		System.out.println("Sua média é " + m);
		
		if(m < 3) {
			System.out.println("REPROVADO");
		}else if(m >= 6) {
			System.out.println("APROVADO");
		}else if(m >=3 && m <= 6) {
			System.out.println("EXAME");
		}
		System.out.println("Nota exame");
		ex = ler.nextInt();
		
		not = (m+ex)/2;
		
		 if(not >= 6) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
		ler.close();
	}
}



