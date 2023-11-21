package vetor;

import java.util.Scanner;

public class Vmmi {
	public static void main(String[] args) {
		final int Tam=10;
		int a[];
		a = new int[Tam];
		int[] b = new int[10];
		int[] c = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < Tam; i++) {
		System.out.println("entre com o valor A");
		a[i] = sc.nextInt();
		System.out.println("entre com o valor B");
		b[i] = sc.nextInt(); 
		}
		System.out.println("Vetor B:");
		for(int i = 0; i < Tam; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		for(int i = 0; i < c.length; i++) {
			System.out.println("c["+ (i+1) + "]:"+ c[i]);
		}
		sc.close();
	}
}

