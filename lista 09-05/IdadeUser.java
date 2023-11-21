package todos;
import java.util.Scanner;
public class IdadeUser {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int id1,id2,id3,id4,id5;
		String n1,n2,n3,n4,n5;
		
		System.out.println("Usuario 1");
		System.out.println("nome:");
		n1 = ler.next();
		System.out.println("Idade:");
		id1 = ler.nextInt();
		
		System.out.println("Usuario 2");
		System.out.println("nome:");
		n2 = ler.next();
		System.out.println("Idade:");
		id2 = ler.nextInt();
		
		System.out.println("Usuario 3");
		System.out.println("nome:");
		n3 = ler.next();
		System.out.println("Idade:");
		id3 = ler.nextInt();
		
		System.out.println("Usuario 4");
		System.out.println("nome:");
		n4 = ler.next();
		System.out.println("Idade:");
		id4 = ler.nextInt();
		
		System.out.println("Usuario 5");
		System.out.println("nome:");
		n5 = ler.next();
		System.out.println("Idade:");
		id5 = ler.nextInt();
		
		if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5 ) {
			System.out.println("O usuario mais velho é " + n1 + " tendo " + id1);
		}else if (id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5 ) {
			System.out.println("O usuario mais velho é " + n2 + " tendo " + id2);
		}else if (id3 > id1 && id3 > id2 && id3 > id4 && id3 > id5) {
			System.out.println("O usuario mais velho é " + n3 + " tendo " + id3);
		}else if (id4 > id1 && id4 > id2 && id4 > id3 && id4 > id5) {
			System.out.println("O usuario mais velho é " + n4 + " tendo " + id4);
		}else if (id5 > id1 && id5 > id2 && id5 > id3 && id5 > id4) {
			System.out.println("O usuario mais velho é " + n5 + " tendo " + id5);
		}
		
		if(id1 < id2 && id1 < id3 && id1 < id4 && id1 < id5) {
			System.out.println("O usuario mais novo é " + n1 + " tendo " + id1);
		}else if (id2 < id1 && id2 < id3 && id2 < id4 && id2 < id5) {
			System.out.println("O usuario mais novo é " + n2 + " tendo " + id2);
		}else if (id3 < id1 && id3 < id2 && id3 < id4 && id3 < id5) {
			System.out.println("O usuario mais novo é " + n3 + " tendo " + id3);
		}else if (id4 < id1 && id4 < id2 && id4 < id3 && id4 < id5) {
			System.out.println("O usuario mais novo é " + n4 + " tendo " + id4);
		}else if (id5 < id1 && id5 < id2 && id5 < id3 && id5 < id4) {
			System.out.println("O usuario mais novo é " + n5 + " tendo " + id5);
		}
		ler.close();
	}
}
