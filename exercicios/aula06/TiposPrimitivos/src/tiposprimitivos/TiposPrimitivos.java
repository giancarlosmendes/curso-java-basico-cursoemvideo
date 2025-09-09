
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        //TIPOS PRIMITIVOS e ENTRADA DE DADOS       
        //String nome = "Gustavo"; //entrada de dados fixa (String)
        //float nota = 8.5f; //entrada de dados fixa (float)
        
        Scanner teclado = new Scanner(System.in); //cria objeto para receber entrada de dados interativa
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //entrada de dados interativa (String)
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); //entrada de dados interativa (float)
        
        //SAÍDA DE DADOS
        //System.out.print("A nota é " + nota); //print normal
        //System.out.println("A nota é " + nota); //print e pula linha
        //System.out.printf("A nota de %s é %.2f \n", nome, nota); //print formatado
        System.out.format("A nota de %s é %.2f \n", nome, nota); //print formatado 2
    }
    
}
