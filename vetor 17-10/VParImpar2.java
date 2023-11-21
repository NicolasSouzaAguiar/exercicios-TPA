package vetor;

import java.util.Scanner;

public class VParImpar2 {
	public static void main(String[] args) {
		final int Tam=10;
		int a[];
		a = new int[Tam];
		int[] b = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < Tam; i++) {
		System.out.println("entre com o valor");
		a[i] = sc.nextInt();
		 
		}
		System.out.println("Vetor B:");
		for(int i = 0; i < Tam; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println("b["+ (i+1) + "]:"+ b[i]);
		}
		sc.close();
	}
}
