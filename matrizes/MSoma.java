package matriz;
import java.util.Scanner;
public class MSoma {
	public static void main(String[] args) {
		int a[][], i,j,v=2;
		a = new int [3][4];
		Scanner sc = new Scanner(System.in);
		for(i=0; i <3;i++) {
			for(j=0; j<4;j++) {
				System.out.println("Entre com o valor da coluna "+(j+1)+" linha "+ (i+1));
				a[i][j] = sc.nextInt();
	}
}
		for(i=0;i<3;i++) {
			System.out.println();
			for(j=1; j<4;j++) {
				
				System.out.print("[ "+a[i][j]+" ]");
			}
		}
	}
}
