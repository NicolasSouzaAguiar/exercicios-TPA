package vetor;
import java.util.Scanner;

public class VInvertido {
    public static void main(String[] args) {
        int Tam = 10;
        int[] a = new int[Tam];
        int[] b = new int[Tam];

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite os valores para o vetor A:");
        for (int i = 0; i <Tam; i++) {
            a[i] = sc.nextInt();
        }

        
        for (int i = 0; i < Tam; i++) {
            b[i] = a[Tam - 1 - i];
        }

       
        System.out.println("Vetor B (Invertido de A):");
        for (int i = 0; i <Tam; i++) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}
