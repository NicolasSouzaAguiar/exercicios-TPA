package vetor;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		
		//Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
		//imprima a tabuada de cada um dos elementos do vetor A.

		
		Scanner sc = new Scanner(System.in);
		final int Tam=6;
		int i, a[],m,r;
		a=new int[Tam];
		 
		
		 for ( i=1; i<Tam; i++) {
			 System.out.println("Entre com o Valor:");
				a[i] = sc.nextInt();
			System.out.println("Tabuada do " + a[i] + ":");

	            for ( m=1; m<=10; m++) {
	                r = a[i] * m;
	                System.out.println(a[i] +" + "+ m +" = "+ r);
	            }
	            System.out.println();            
		 }
		 sc.close();
		 
	 }
	 
	}

