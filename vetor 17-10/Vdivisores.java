package vetor;

public class Vdivisores {
    public static void main(String[] args) {
        
    	// Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
    	//imprima cada elemento do vetor A e a relação de todos os divisores do 
    	//respectivo elemento.
    	
    	int e,A[] = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = i + 1; 
        }

        
        for (int i = 0; i < 10; i++) {
            e = A[i];
            System.out.print("Elemento " + e + " Seu Divisores = ");
            
            for (int d = 1; d <= e; d++) {
                if (e % d == 0) {
                    System.out.print(d + " ");
                }
            }
            
            System.out.println();
            System.out.println();
        }
    }
}

