package vetor;
import java.util.Scanner;
public class Vrotina {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final int Tam = 10; 
int i, a[], x;
a = new int[Tam];
for (i=0; i<Tam; i++) {
System.out.println("Entre com o "+(i+1)+" valor");
a[i]  = sc.nextInt();
}
System.out.print("Digite o elemento que deseja buscar: ");
 x = sc.nextInt();

 boolean achou = false;
 sc.close();
 for (i=0; i<Tam; i++) {
	 if (a[i] == x) {
		 achou=true;
		 break;
	 }
 }
	 if(achou == true) {
		 System.out.println("achou");
  }else {
	 System.out.println("Nâo achou");
 
  }
	
}
}