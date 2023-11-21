import java.util.Scanner;
public class tabuada {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int i=1,n,r;
		 System.out.println("entre com um numero para a tabuada");
		 n= sc.nextInt();
		 while(i<=10) {
			 r=n*i;
			 System.out.println(n+"x"+i+"="+r);
			 i++;
		 }
		 sc.close();
	 }
}	 