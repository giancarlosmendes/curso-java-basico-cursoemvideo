
package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        /* OPERADORES LÓGICOS
        
        && (.E.)  -> true && false = false
        || (.OU.) -> false || true = true
        ^ (.XOU.) -> true ^ true = false
        ! (.NAO.) -> !false = true        
        */
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r1;
        boolean r2;
        boolean r3;
        boolean r4;
        
        //operador && (E)
        r1 = (x < y && y < z) ? true : false;
        System.out.println(r1);
        
        //operador || (OU)
        r2 = (x < y || y == z) ? true : false;
        System.out.println(r2);
        
        //operador ^ (OU exclusivo)
        r3 = (x < y ^ y == z) ? true : false;
        System.out.println(r3);

    }
    
}
