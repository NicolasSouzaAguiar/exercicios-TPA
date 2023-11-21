package todos;
import java.util.Scanner;
public class crescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Mostre os valores");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if (a < b && b < c ) {
			System.out.println("ordem:" + a + "," + b + "," +c);
		}else if (b < a && a < c ) {
			System.out.println("ordem:" + b + "," + a + "," +c);
		}else if(c < a && a < b) {
			System.out.println("ordem:" + c + "," + a + "," +b);
		}else if(c < b && b < a) {
			System.out.println("ordem:" + c + "," + b + "," +a);
		}else if(b < c && c < a) {
			System.out.println("ordem:" + b + "," + c + "," +a);
		}else if(a < c && c < b) {
			System.out.println("ordem:" + a + "," + c + "," +b);
		}
		ler.close();
	}
}
