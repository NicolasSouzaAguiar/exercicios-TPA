package vetor;

public class Vpotencia {
	public static void main(String[] args) {
		//Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que cada 
		//elemento do vetor A � formado pela pot�ncia de base 2 elevado ao expoente 
		//igual a posi��o do respectivo elemento, ou seja:
		//A[i] = 2i
		
		int A[] = new int[11];

        for (int i = 0; i < 11; i++) {
            A[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < A[i]; i++) {
        	System.out.println("A["+i+ "]=" + A[i]);
           }
	}
    
}

