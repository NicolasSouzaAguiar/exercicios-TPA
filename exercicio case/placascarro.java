import java.util.Scanner;
public class placascarro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		
		System.out.println("entre com o ultimo numero da placa");
		p = in.nextInt();
		switch(p) {
		case 1:
		case 2:
			System.out.println("Dia do Rodizio: Segunda");
			break;
		case 3:
		case 4:
			System.out.println("Dia do Rodizio: Terça");
			break;
		case 5:
		case 6:
			System.out.println("Dia do Rodizio: Quarta");
			break;
		case 7:
		case 8:
			System.out.println("Dia do Rodizio: Quinta");
			break;
		case 9:
		case 0:
			System.out.println("Dia do Rodizio: Sexta");
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
		in.close();
	}		
}
