package vetor;
import java.util.Scanner;
public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int Tam=10;
		int i, a[], b[], c[];
		
		a=new int[Tam];
	    b=new int[Tam];
	    c=new int[Tam];
	    
	    for (i=0; i<Tam; i++) {
	    	System.out.println("Entre com o "+(i+1)+" numero");
	    	a[i] = sc.nextInt();
	    	
	 
	    }
	    for (i=0; i<Tam; i++) {
	    	System.out.println("Entre com o "+(i+1)+" numero");
	    	b[i] = sc.nextInt();
	    	
	    	sc.close();
	    }
	    for (i=0; i<Tam; i++) {	
			c[i] = a[i] + b[i];
	    	System.out.println("c["+ i + "]:"+ c[i]);
	    	
		}
	}
}
