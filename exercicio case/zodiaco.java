import java.util.Scanner;
public class zodiaco {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mesNasc, diaNasc;
        System.out.println("Digite numero do mes de nascimento:");
        mesNasc = ler.nextInt();
        System.out.println("Digite o dia do nascimento:");
        diaNasc = ler.nextInt();
        switch (mesNasc){
            case 1:
            if(diaNasc>=1&&diaNasc<=20){
                System.out.println("Seu signo � capricornio");
            }else if(diaNasc>=20 && diaNasc<=31){
                System.out.println("Seu signo � aquario");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 2:
            if(diaNasc>=1 && diaNasc<=19){
                System.out.println("Seu signo � aquario");
            }else if(diaNasc>19 && diaNasc<=28){
                System.out.println("Seu signo � peixes");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 3:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo � peixes");
            }else if(diaNasc>20 && diaNasc<=31){
                System.out.println("Seu signo � aries");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 4:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo � aries");
            }else if(diaNasc>20 && diaNasc<=30){
                System.out.println("Seu signo � touro");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 5:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo � touro");
            }else if(diaNasc>20 && diaNasc<=31){
                System.out.println("Seu signo � g�meos");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 6:
            if(diaNasc>=1 && diaNasc<=20){
                System.out.println("Seu signo � g�meos");
            }else if(diaNasc>20 && diaNasc<=30){
                System.out.println("Seu signo � c�ncer");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 7:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo � c�ncer");
            }else if(diaNasc>21 && diaNasc<=31){
                System.out.println("Seu signo � le�o");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 8:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo � le�o");
            }else if(diaNasc>22 && diaNasc<=31){
                System.out.println("Seu signo � virgem");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 9:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo � virgem");
            }else if(diaNasc>22 & diaNasc<=30){
                System.out.println("Seu signo � libra");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 10:
            if(diaNasc>=1 && diaNasc<=22){
                System.out.println("Seu signo � libra");
            }else if(diaNasc>22 && diaNasc<=31){
                System.out.println("Seu signo � escorpi�o");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 11:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo � escorpi�o");
            }else if(diaNasc>21 && diaNasc<=30){
                System.out.println("Seu signo � sagit�rio");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            case 12:
            if(diaNasc>=1 && diaNasc<=21){
                System.out.println("Seu signo � sagit�rio");
            }else if(diaNasc>21 && diaNasc<=31){
                System.out.println("Seu signo � capricornio");
            }else{
                System.out.println("Dia invalido");
            }
            break;
            default:
                System.out.println("Mes invalido");
        }
    }
}