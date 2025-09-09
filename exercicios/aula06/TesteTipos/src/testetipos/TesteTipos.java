
package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        
        // Conversão de int para String
        int idade1 = 30;
        String valor1 = Integer.toString(idade1);
        System.out.println(valor1);
        
        // Conversão de String para int
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        // Conversão de String para float
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("%.2f \n", idade3);
        
    }
    
}
