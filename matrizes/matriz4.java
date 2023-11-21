package matriz;
import java.util.Random;

public class matriz4{
  public static void main(String[] args) {
  boolean[][] cartela = new boolean[4][4];
   int rodadas=0;
   Random random = new Random();       
  for(int i=0; i<4; i++) {
  for(int j=0; j<4; j++) {
  cartela[i][j] = false;
        }
     }
  for(;; rodadas++) {
  int linha = random.nextInt(4);
  int coluna = random.nextInt(4);           
  if (cartela[linha][coluna]==false) {
  int numero=random.nextInt(75) + 1;
  cartela[linha][coluna]=true;
            }            
  rodadas++;
  int numeroSort = random.nextInt(75)+1;
  System.out.println("numero aleatorio: " + numeroSort);
  boolean encontrado = false;
  for (int i = 0; i<4; i++) {
  for (int j = 0; j<4; j++) {
     if (cartela[i][j] && ((i * 4 + j + 1) == numeroSort)) {
  encontrado = true;
  i = 4; 
  break;
                    }
                }
            }

  boolean cartelaterm=true;

      for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
       if (cartela[i][j] == false) {   
            cartelaterm = false;
           i = 4; 
 break;
                    }
                }
            }

 System.out.println(encontrado ? "A cartela tem o número." : "A cartela nao tem o número.");  
 if (cartelaterm) {
 System.out.println(" cartela completa em " + rodadas + " rodadas bingo");
 break;
            }
        }
    }
}
