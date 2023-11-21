import java.util.Scanner;
public class mencao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aluno, mb, b, r, i;
		double n;
		String q;
		
		System.out.println("Qual a quantidade de alunos MB?");
		mb = sc.nextInt();
		System.out.println("Qual a quantidade de alunos B?");
		b = sc.nextInt();
		System.out.println("Qual a quantidade de alunos R?");
		r = sc.nextInt();
		System.out.println("Qual a quantidade de alunos I?");
		i = sc.nextInt();
		
		aluno = mb+b+r+i;
		
		System.out.println("Digite qual nota quer saber a Porcentagem");
		q = sc.next();
		switch(q) {
		case "mb":
			n = (mb*100/aluno) ;
			System.out.println("Alunos MB:"+n+"%");
			break;
		case "b":
			n = (b*100/aluno) ;
			System.out.println("Alunos B:"+n+"%");
			break;
		case "r":
			n = (r*100/aluno)  ;
			System.out.println("Alunos R:"+n+"%");
			break;
		case "i":
			n = (i*100/aluno)  ;
			System.out.println("Alunos I:"+n+"%");
			break;
		default:
			System.out.println("Nota Invalida");
		}
		sc.close();
	}
}
