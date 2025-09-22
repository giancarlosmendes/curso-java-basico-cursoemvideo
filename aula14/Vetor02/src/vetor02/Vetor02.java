
package vetor02;

import java.time.LocalDate;
import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
 
        //Obtém ano atual de forma manual
        //Scanner teclado = new Scanner(System.in);
        //System.out.print("Digite o ano atual: ");
        //int anoAtual = teclado.nextInt();

        int anoAtual = LocalDate.now().getYear(); // Obtém ano atual automaticamente  
        
        /* Para saber se um ano é bissexto:
        Primeiro verifica-se se o número do ano é divisível por 4; 
        Se for, então se verifica se é um ano centenário (terminado em 00). 
        Se for um ano centenário, ele só é bissexto se também for divisível por 400.        
        */
        boolean anoBissexto;
        
        if (anoAtual % 4 == 0) { // Divisivel for 4?
            if (anoAtual % 100 == 0) { // Centenário? 
                if (anoAtual % 400 == 0) { // Divisivel por 400?
                    anoBissexto = true;
                } else {
                    anoBissexto = false;
                }
            } else {
                anoBissexto = true;
            }
        } else {
            anoBissexto = false;
        }
        
        System.out.println("Ano atual: " + anoAtual);
        // System.out.println(anoBissexto);
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (anoBissexto == true) {
            dias[1] = 29;
        }
        
        for(int c=0; c<mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " dias");
        }
    }
    
}
