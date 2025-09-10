
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        
        //ESTRUTURA CONDICIONAL SIMPLES
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi " + media);
        
        if (media > 9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
