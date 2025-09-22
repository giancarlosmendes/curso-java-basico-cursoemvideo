
package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        
        /* Forma 1        
        int n[] = new int[6];
        n[0] = 3;
        n[1] = 2;
        n[2] = 8;
        n[3] = 7;
        n[4] = 5;
        n[5] = 4;        
        */
        
        // Forma 2
        int n[] = {3,2,8,7,5,4};
        
        for(int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
