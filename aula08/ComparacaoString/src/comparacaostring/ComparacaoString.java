
package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        String res2;
        
        res = (nome1 == nome3) ? "igual" : "diferente";
        System.out.println(res);
        /* resultado foi 'diferente' pois apesar de terem o conteúdo igual, 
        tecnicamente nome1 e nome3 possuem estruturas diferentes pois nome3 
        foi instanciado utilizando a cláusula 'new' */
        
        //para verificar se o CONTEÚDO de um objeto é igual a outro
        res2 = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res2);
        
    }
    
}
