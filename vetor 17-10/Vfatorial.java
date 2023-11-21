package vetor;
import java.util.Scanner;
public class Vfatorial {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  final int Tam = 15;
	  long[]A=new long[Tam];
	  long[]B=new long[Tam];
	  
	  System.out.println("escreva 15 numeros para o vetor A: ");
	  for (int i = 0; i < Tam; i++) {
	  A[i] = sc.nextLong();
	  sc.close();
	  }
	  System.out.println("Vetor B (fatoriais): ");
	   for (int i=0;i<Tam;i++) {
		   
	   B[i] = 1;
	   
	   for (int n=2;n<=A[i];n++) {
	   
	   B[i] *= n;
	            }
	   System.out.println("[" + (i+1) + "] = " +B[i]);
        }
    }
}

