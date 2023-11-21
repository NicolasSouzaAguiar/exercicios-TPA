public class tabuada {
	 public static void main(String[] args) {
		 //5) Criar um programa que apresente as tabuadas dos números de 1 a
		 //10
		 int i,r,m;
		 
		 for ( i=1; i<=10; i++) {
	            System.out.println("Tabuada do " + i + ":");

	            for ( m=1; m<=10; m++) {
	                r = i * m;
	                System.out.println(i + " x " + m + " = " + r);
	            }
	            System.out.println();
		 }
	 }
}	 