package lista0606;
import java.util.Scanner;
public class Viagem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vol,preco,bag,assento,fina;
		int cobr;
		
		System.out.println("Insira o preço da Passagem");
		preco = sc.nextInt();
		//Vai despachar bagagem? Se sim, ler a quantidade de volumes 
		//pois para cada volume é cobrado R$ 90,00
		System.out.println("Irá despachar bagagem? " + "1 para sim, 2 para não");
		bag = sc.nextInt();
		if (bag == 1) {
			System.out.println("qual a quantidade de volumes?");
			vol = sc.nextInt();
			cobr = 90*vol;
		}else if(bag == 2) {
			System.out.println("");
		}
		//Quer marcar o assento? 
		//Caso sim, será cobrada uma taxa de R$ 60,00
		System.out.println("Quer marcar o assento?" + "1=sim, 2=nao");
		assento = sc.nextInt();
		if(assento == 1) {
			assento= 60;
		}
		if(assento == 1 &&  ) {
			System.out.println("Valor Final:");	
		}
		
	}
}
