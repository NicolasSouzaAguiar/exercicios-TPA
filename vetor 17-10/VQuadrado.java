package vetor;
import java.util.Scanner;
public class VQuadrado {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final int Tam=10;
	int i, a[], b[];
	
	a=new int[Tam];
    b=new int[Tam];
    
    for (i=0; i<Tam; i++) {
    	System.out.println("Entre com o "+(i+1)+" numero");
    	a[i] = sc.nextInt();
    	b[i] = a[i];
    	
    	sc.close();
    }
	for (i=0; i<Tam; i++) {	
		System.out.println("O Valor ao quadrado é:"+ (b[i] * b[i]));
	}
	
}
}
