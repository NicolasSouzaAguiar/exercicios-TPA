package vetor;
import java.util.Scanner;
public class VPrimo {
	public static void main(String[] args) {
		//Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
		//imprima cada elemento do vetor A e uma mensagem indicando se o 
		//respectivo elemento é um número primo ou não.
		
		
		Scanner sc = new Scanner(System.in);
			final int Tam=10;
			int i,a[];
			a=new int[Tam];
		    
		    for(i=0;i<Tam; i++) {
		    	System.out.println("DIGITE O " +(i+1)+" valor:");
		    	a[i] = sc.nextInt();
		    	if(a[i] % 2 == 0 && a[i] != 2) {
		    		System.out.println("Numero nao primo");
		    	}else {
		    		System.out.println("Seu numero é primo");
		    	}
		    	sc.close();
		    }
	}
}
