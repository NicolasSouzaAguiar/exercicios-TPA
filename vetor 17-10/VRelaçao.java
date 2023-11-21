package vetor;
import java.util.Scanner;
public class VRelaçao {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 final int Tam = 10;
	 int i,a[],n;
	  a= new int[Tam];
	  System.out.println("Digite 10 números inteiros: ");
	  for (i = 0; i < Tam; i++) {
	  a[i] = sc.nextInt();
	  sc.close();
	  }
	  for (i = 0; i < Tam; i++) {
			System.out.print("Elemento " + (i + 1) + " do vetor A: " + a[i]);
			System.out.print(" Pares de 0 até o elemento " + a[i] + ": ");
	       for (n = 0; n <= a[i]; n++) {
			  if (n % 2 == 0) {
			   System.out.print(n + " ");
			 }
	 }
	 System.out.println();
   }
  } 
}
