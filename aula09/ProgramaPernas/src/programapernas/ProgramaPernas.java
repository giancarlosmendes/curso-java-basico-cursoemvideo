
package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        
        //ESTRUTURA CONDICIONAL DE MÚLTIPLA ESCOLHA
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        
        switch (pernas) {
            case 1: 
                tipo = "Saci";
                break;            
            case 2: 
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
        
    }
    
}
