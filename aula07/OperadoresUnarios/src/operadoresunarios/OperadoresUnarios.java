
package operadoresunarios;

public class OperadoresUnarios {

    public static void main(String[] args) {
        
        //OPERADORES UNÁRIOS
        int numero = 5;
        
        //Incremento
        numero++; //é o mesmo que numero = numero + 1
        
        //Decremento
        numero--; //é o mesmo que numero = numero - 1
    
        //Pós-incremento
        int numero1 = 5;
        int valor1 = 5 + numero1++; //o incremento de 'numero1' só acontece DEPOIS da operação
        System.out.println(valor1);
        
        //Pré-incremento
        int numero2 = 5;
        int valor2 = 5 + ++numero2; //o incremento de 'numero2' acontece ANTES da operação
        System.out.println(valor2);
        
        //Pós-decremento
        int numero3 = 10;
        int valor3 = 4 + numero3--; //o decremento de 'numero3' só acontece DEPOIS da operação
        System.out.println(valor3);
        
        //Pré-decremento
        int numero4 = 10;
        int valor4 = 4 + --numero4; //o decremento de 'numero4' acontece ANTES da operação
        System.out.println(valor4);
    }
    
}
