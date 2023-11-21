package todos;
import java.util.Locale;
import java.util.Scanner;
public class imc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double peso, altura,imc;
		
		System.out.println("informe sua altura");
		altura = sc.nextDouble();
		System.out.println("Informe seu peso");
		peso = sc.nextDouble();
		
		imc = peso / (altura*altura);
		
		System.out.println(imc);
		
		if( imc < 18.5) {
			System.out.println("Excesso de magreza");
		}else if (imc >= 18.5 && imc <=25) {
			System.out.println("Peso normal");
		}else if (imc >= 25 && imc <= 30) {
			System.out.println("Excesso de peso");
		}else if (imc >= 30 && imc <= 35) {
			System.out.println("Obesidade (Grau I)");
		}else if (imc >= 35 && imc <= 40) {
			System.out.println("Obesidade (Grau II)");
		}else {
			System.out.println("Obesidade (Grau III)");
		}
		sc.close();
	}
}
