
package contador01;

public class Contador01 {

    public static void main(String[] args) {
        
        /* Repetição com teste no início (enquanto)
        int cc = 1;
        while (cc <= 4) {
            System.out.println("Cambalhota " + cc);
            cc++;
        }*/
        
        /* Mudando o fluxo de um laço (continue -> joga pra cima do laço (pula o comando seguinte e volta pro inicio do laço))
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 5 || cc == 7 || cc == 9) {
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }*/
        
        // Mudando o fluxo de um laço (break -> joga para fora do laço)
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }

    }
    
}
