import java.util.Scanner;
public class escolaFutebol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("entre com a idade da crian�a de 6 at� 10 anos:");
		idade= sc.nextInt();
		switch(idade) {
		case 6:
		System.out.println("dente de leite");
		break;
		case 7:
		System.out.println("j�nior");
		break;
		case 8:
	    System.out.println("j�nior max");
	    break;
		case 9:
		System.out.println("j�nior master");
	    break;
		case 10:
		System.out.println("master");
		break;
		default:
			System.out.println("idade invalida");
			break;
		}
		sc.close();
	}

}
