
package vetor05;

import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {
        
        // Preenchendo vetor com o mesmo valor em todas as posições
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
