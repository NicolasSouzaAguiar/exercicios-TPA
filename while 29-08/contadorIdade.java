import java.util.Scanner;

public class contadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maioresIdade = 0;
        int menoresIdade = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Informe a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                maioresIdade++;
            } else {
                menoresIdade++;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas maiores de idade: " + maioresIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + menoresIdade);

        scanner.close();
    }
}
