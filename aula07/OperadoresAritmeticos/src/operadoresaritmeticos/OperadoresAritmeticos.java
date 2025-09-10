
package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //OPERADORES ARITMÉTICOS
        int n1 = 3;
        int n2 = 5;
        
        //Soma
        int soma = n1 + n2;
        System.out.printf("A soma de %d + %d = %d \n", n1, n2, soma);
        
        //Subtração
        int sub = n1 - n2;
        System.out.printf("A subtração de %d - %d = %d \n", n1, n2, sub);
        
        //Multiplicação
        int mult = n1 * n2;
        System.out.printf("A multiplicação de %d * %d = %d \n", n1, n2, mult);
        
        //Divisão
        /* Observação: para obter resultado com os decimais, um dos operandos 
        precisa ser forçado a ser convertido com typecast float ou double */
        float divi = (float) n1 / n2;
        System.out.printf("A divisão de %d / %d = %.2f \n", n1, n2, divi);
        
        //Resto da divisão
        int res = n1 % n2;
        System.out.printf("O resto da divisão de %d / %d = %d \n", n1, n2, res);
        
        //Média
        float media = (n1 + n2)/2;
        System.out.printf("A média entre %d e %d = %.2f \n", n1, n2, media);
        
    }

}
