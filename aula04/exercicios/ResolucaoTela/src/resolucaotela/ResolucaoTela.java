
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        //Resolução da tela
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension dimensao = tela.getScreenSize();
        int largura = dimensao.width;
        int altura = dimensao.height;
        
        System.out.println("Sua tela tem resolução " + largura + "x" + altura);
    }
    
}
