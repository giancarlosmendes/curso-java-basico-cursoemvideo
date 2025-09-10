
package classemath;

public class ClasseMath {

    public static void main(String[] args) {
        
        /* CLASSE MATH
        PI (constante π) -> Math.PI -> 3.1415...
        pow (exponenciação) -> Math.pow(5,2) -> 25
        sqrt (raiz quadrada) -> Math.sqrt(25) -> 5
        cbrt (raiz cúbica) -> Math.cbrt(27) -> 3    
        */
        
        //exponenciação
        int exp = (int) Math.pow(5,2);
        //System.out.println(exp);
        
        //raiz quadrada
        int res = (int) Math.sqrt(25);
        //System.out.println(res);
        
        /* Arredondamentos
        abs (valor absoluto) -> Math.abs(-10) -> 10
        floor (arrendonda para baixo) -> Math.floor(3.9) -> 3
        ceil (arredonda para cima) -> Math.round(4.2) -> 5
        round (arredonda aritmeticamente) -> Math.round(5.6) -> 6
        */
        
        float v = 8.9f;
        
        //arredonda para baixo
        int ar1 = (int) Math.floor(v);
        //System.out.println(ar1);
             
        //arredonda para cima
        int ar2 = (int) Math.ceil(v);
        //System.out.println(ar2);
        
        //arredonda aritmeticamente
        int ar3 = (int) Math.round(v);
        //System.out.println(ar3);
        
        /* Gerador de números aleatórios
        Math.random() -> gera números aleatórios entre 0.0 e 1.0
        
        Macete para gerar números inteiros em intervalos específicos:
        menor_numero + Math.random() * (maior_numero - menor_numero)
        
        Exemplo 1: obter um número aleatório entre 5 e 10
            -> 5 + Math.random() * (10 - 5)
        
        Exemplo 2: obter um número aleatório entre 0 e 9
            -> 0 + Math.random() * (9 - 0)
        
        Exemplo 3: obter um número aleatório entre 2 e 1000000
            -> 2 + Math.random() * (1000000 - 2)
        */
        
        //gera número aleatório entre 0.0 e 1.0
        double ale = Math.random();
        System.out.println(ale);
        
        //gera número aleatório inteiro entre 5 e 10
        int n1 = (int) (5 + Math.random() * (10 - 5));
        System.out.println(n1);
        
        //gera número aleatório inteiro entre 15 e 50
        int n2 = (int) (15 + Math.random() * (50 - 15));
        System.out.println(n2);
        
    }
    
}
