
package testefuncao01;

public class TesteFuncao01 {

    /* Método sem retorno
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    */
    
    // Método com retorno
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        
        // chamada de método sem retorno
        //soma(5,2);
        
        // chamada de método com retorno
        int sm = soma(5,2);
        System.out.println("A soma é " + sm);
    }
    
}
