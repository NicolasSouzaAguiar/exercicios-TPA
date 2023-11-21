public class multiplo {
	public static void main(String[] args) {	
	//3) Criar um programa que conte de 1 a 100 e a cada múltiplo de 10
	//	emita uma mensagem:
	//		“Múltiplo de 10”.
		for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Múltiplo de 10: "+ i);
            } else {
                System.out.println(i);
            }
        }
    }
}
