
package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        
        /* OPERADOR TERNÁRIO
        Exemplo:
            maior = n1 > n2 ? n1 : n2;
        
        O operador é ternário porque possui 3 componentes:
        1º- O que vem antes da ?
        2º- O que vem depois da ?
        3º- O que vem depois dos :
        
        - O 1º componente (antes da ?) é uma expressão;
        - O 2º componente (depois da ?) é o valor que será atribuído 
        caso a expressão seja verdadeira;
        - O 3º componente (depois dos :) é o valor que será atribuído
        caso a expressão seja falsa.     
        
        Observação: O objetivo da operação com o operador ternário é atribuir um
        valor ou outro a uma mesma variável. Se o objetivo não for esse, não 
        adianta utilizar esse operador.
        */
        
        int n1, n2, maior;
        n1 = 5;
        n2 = 8;
        maior = (n1 > n2) ? n1 : n2;
        System.out.println(maior);
        
    }
    
}
