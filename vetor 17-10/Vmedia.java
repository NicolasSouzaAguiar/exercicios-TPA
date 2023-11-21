package vetor;
import java.util.Scanner;
public class Vmedia {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final int Tam = 10; 
int i, a[];
double p, media;
a = new int[Tam];
for (i=0; i<Tam; i++) {
System.out.println("Entre com o "+(i+1)+" valor");
a[i]  = sc.nextInt();
sc.close();
}
 p = 0;
for (i=0; i<Tam; i++) {
    p += a[i];
}
 media = p / 10;

System.out.println("A média dos valores lidos é: " + media);
}
}