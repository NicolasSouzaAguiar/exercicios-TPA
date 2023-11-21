package matriz;
import java.util.Random;
public class matriz2 {
	public static void main(String[] args) {
		int a[][], i, j;
		a = new int [3][3];
		Random ra = new Random();
		
		for(i=0;i<3;i++) {
			for(j=1; j<3;j++) {
				a[i][j] = ra.nextInt()%50;
			}
		}
		System.out.println("Matriz:");
		for(i=0;i<3;i++) {
			System.out.println();
			for(j=1; j<3;j++) {
				System.out.print("[ "+a[i][j]+" ]");
			}
		}
		 	int mV = a[0][0];
	        int mnV = a[0][0];
	        int lM = 0;
	        int cM = 0;
	        int lMn = 0;
	        int cMn = 0;
	        
	        System.out.println();
	        for ( i = 0; i < 3; i++) {
	            for ( j = 0; j < 3; j++) {
	                if (a[i][j] > mV) {
	                    mV = a[i][j];
	                    lM = i;
	                    cM = j;
	                }
	                if (a[i][j] < mnV) {
	                    mV = a[i][j];
	                    lMn = i;
	                    cMn = j;
	                }
	            }
	        }
	        System.out.println("\nMaior valor: " + mV + " (linha: " + lM + ", coluna: " + cM + ")");
	        System.out.println("Menor valor: " + mnV + " (linha: " + lMn + ", coluna: " + cMn + ")");
	}
	
}
