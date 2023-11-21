package vetor;
import java.util.Scanner;
public class Vintersecçao {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  final int Tam = 10;
  int[]A=new int[Tam];
  int[]B=new int[Tam];
  int[]C=new int[Tam];
  int k = 0;
 System.out.println("escreva 10 numeros para o conjunto A: ");
 for (int i = 0; i < Tam; i++) {
 A[i] = sc.nextInt();
 }
 System.out.println("escreva 10 numeros para o conjunto B: ");
 for (int i = 0; i < Tam; i++) {
 B[i] = sc.nextInt();
 sc.close();
 }

 for (int i = 0; i < Tam; i++) {
 int j;
 for (j = 0; j < Tam; j++) {
 if (A[i] == B[j]) {
 break;
       }
    }
 if (j == Tam) {
 C[k] = A[i];
 k++;
     }
 }

 System.out.println("Vetor C (diferença dos conjuntos A e B): ");
 for (int i = 0; i < k; i++) {
     System.out.print(C[i] + " ");
 }
}
}