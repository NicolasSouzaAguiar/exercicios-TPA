package vetor;

public class VPalindromo {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,4,3,2,1};
		int i;
	    
		
		boolean P = true;
		for(i = 0; i < a.length / 2;i++) {
			if(a[i] != a[a.length - 1 - i]) {
				P = false;
				break;
			}
		}
		if(P) {
			System.out.println("Seu vetor é um palíndromo");
		}else {
			System.out.println("Seu vetor não é um palíndromo");
		}
	}
}
