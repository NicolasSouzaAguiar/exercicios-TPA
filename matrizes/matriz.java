package matriz;
public class matriz {
	public static void main(String[] args) {
		int a[][], i,j,v=2;
		a = new int [4][4];
		
		for(i=1; i <4;i++) {
			for(j=1; j<4;j++) {
				System.out.println("Entre com o valor da coluna "+(j+1)+" linha "+ (i+1));
				a[i][j] = v;
				v = v*2;
			}
		}
		for(i=1;i<4;i++) {
			System.out.println();
			for(j=1; j<4;j++) {
				
				System.out.print("[ "+a[i][j]+" ]");
			}
		}
	}
}
