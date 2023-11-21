package vetor;
import java.util.Scanner;

public class VetorCrescente {
    public static void main(String[] args) {
        int tam = 10;
        int[] A = new int[tam];
        int[] B = new int[tam];
        int[] C = new int[tam];

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < tam; i++) {
            A[i] = sc.nextInt();
            sc.close();
        }

        
        for (int i = 0; i < tam; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }

        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }

        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (C[j] < C[j + 1]) {
                    int temp = C[j];
                    C[j] = C[j + 1];
                    C[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Vetor B (crescente):");
        for (int i = 0; i < tam; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nVetor C (decrescente):");
        for (int i = 0; i < tam; i++) {
            System.out.print(C[i] + " ");
        }
    }
}

