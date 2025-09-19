
package repeticaofor;

public class RepeticaoFor {

    public static void main(String[] args) {
        
        /* Estrutura de Repetição com Teste Lógico no Início [While][Enquanto]
        /* Como falar: ENQUANTO [a condição for satisfeita] FAÇA [o(s) comando(s)]
        
        int cc=0;
        while (cc<4) {
            System.out.println("Cambalhota");
            cc++; // ou cc += 1; ou cc = cc + 1;
        }
        
        */
        
        /* Estrutura de Repetição com Teste Lógico no Final [While "de cabeça pra baixo"]["Repita"]
        /* Obs: O 'Repita' do algoritmo seria um "Enquanto de cabeça pra baixo" no Java, pois há uma inversão no teste lógico]
        /* Como falar: FAÇA [o(s) comando(s)] ENQUANTO [a condição for satisfeita]
        
        int cc=0;
        do {
            System.out.println("Cambalhota");
            cc++; // ou cc += 1; ou cc = cc + 1;
        } while (cc<4);
        
        */
        
        /* Estrutura de Repetição com Variável de Controle [For ou um "While Simplificado"][Para]
        /* Como falar: PARA [contador começando em n (atribuição)]; ENQUANTO [a condição for satisfeita]; PASSO [in(de)cremento]; FAÇA [o(s) comando(s)]
        
        for(int cc=0; cc<4; cc++) { // ou cc += 1; ou cc = cc + 1;
            System.out.println("Cambalhota");
        }
        
        */
        
        for(int cc=0;cc<=100;cc+=10) {
            System.out.println(cc);
        }
        
    }
    
}
