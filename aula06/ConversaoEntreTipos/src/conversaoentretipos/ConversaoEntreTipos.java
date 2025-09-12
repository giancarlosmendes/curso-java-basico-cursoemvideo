
package conversaoentretipos;

public class ConversaoEntreTipos {

    public static void main(String[] args) {
              
        // Conversão de int para String
        int valor = 10;
        String valorConvertido = Integer.toString(valor);
        System.out.println(valorConvertido);
        
        // Conversão de String para int
        String valor2 = "20";
        int valorConvertido2 = Integer.parseInt(valor2);
        System.out.println(valorConvertido2);
        
        // Conversão de float para String
        float valor3 = 30.5f;
        String valorConvertido3 = Float.toString(valor3);
        System.out.println(valorConvertido3);
        
        // Conversão de float para String (Formatada)
        float valor4 = 30.5f;
        String valorConvertido4 = String.format("%.2f", valor4);
        System.out.println(valorConvertido4);
        
        // Conversão de String para float
        String valor5 = "40.5";
        float valorConvertido5 = Float.parseFloat(valor5);
        System.out.println(valorConvertido5);
        
    }
    
}
