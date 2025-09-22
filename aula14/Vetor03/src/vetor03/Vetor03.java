
package vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {        
        
        double v[] = {3.5, 2.75, 9, -4.5};
        
        // Exibindo os valores com For Each -> Para cada elemento de v coloque dentro valor
        for (double valor: v) {
            System.out.print(valor + " ");
        }
        
        System.out.println("");
        
        // Colocando e exibindo vetor em ordem
        Arrays.sort(v);
        for (double valor: v) {
            System.out.print(valor + " ");
        }        

    }
    
}
