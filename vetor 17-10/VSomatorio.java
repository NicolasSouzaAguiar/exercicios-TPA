package vetor;

import java.util.Scanner;

public class VSomatorio {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int Tam = 10;
  int[] A = new int[Tam];
  int[] B = new int[Tam];

  System.out.println("Digite 10 valores inteiros para preencher o vetor A: ");
  for (int i = 0; i < Tam; i++) {
  A[i] = sc.nextInt();
  sc.close();
        }

  for (int i = 0; i < Tam; i++) {
  B[i] = 0;
  for (int j = i; j < Tam; j++) {
  B[i] += A[j];
         }
     }

  System.out.println("Vetor B:");
  for (int i = 0; i < Tam; i++) {
  System.out.println("valor " + (i + 1) + " = " + B[i]);
        }
    }
}