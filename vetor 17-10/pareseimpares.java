package vetor;
import java.util.Scanner;
public class pareseimpares {
	public static void main(String[] args) {
				//Ler um vetor A com 20 elementos. Separar os elementos pares e �mpares de
				//A utilizando apenas um vetor extra B. Sugest�o: no in�cio do vetor B
				//armazene os elementos pares de A e nas posi��es restantes do vetor B
				//armazene os elementos de A que s�o �mpares.

		
				Scanner sc = new Scanner(System.in);
				final int Tam=20;
		        int A[] = new int [Tam];
		        int B[] = new int [Tam];
		        int C = 0;
		        
		       
		        for (int i = 0; i < Tam; i++) {
		        	System.out.println("Entre com o Valor:");
					A[i] = sc.nextInt();
		            if (A[i] % 2 == 0) { 
		                B[C] = A[i]; 
		                C++; 
		            }
		            sc.close();
		        }
		        
		        
		        for (int i = 0; i < Tam; i++) {
		            if (A[i] % 2 != 0) { 
		                B[C] = A[i]; 
		                C++; 
		            }
		        }
		        
		       
		        for (int i = 0; i < B.length; i++) {
		            System.out.print(B[i] + " ");
		        }
		    }
		}
