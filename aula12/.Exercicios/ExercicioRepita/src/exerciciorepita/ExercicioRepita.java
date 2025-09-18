
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        
        int num, soma = 0, totVal = 0, totPar = 0, totImp = 0, aciCem = 0;
        float media;
        do {            
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>", 
                    "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
            if (num != 0) {
                totVal++;
                if (num % 2 == 0) {
                    totPar++;
                } else {
                    totImp++;
                }
                if (num > 100) {
                    aciCem++;
                }
                soma += num;
            }
        } while (num != 0);
        media = (float) soma / totVal;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<hr>" + 
                "Total de Valores: " + totVal + "<br>" +
                "Total de Pares: " + totPar + "<br>" +
                "Total de Ímpares: " + totImp + "<br>" +
                "Acima de 100: " +  aciCem + "<br>" +
                "Soma dos valores: " + soma + "<br>" +
                "Média dos Valores: " + String.format("%.2f", media) + "</html>",
                "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
