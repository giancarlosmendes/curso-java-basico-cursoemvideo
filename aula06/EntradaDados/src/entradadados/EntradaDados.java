
package entradadados;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        
        /* ENTRADA DE DADOS (fixa)
        String nome = "Gustavo";
        int idade = 15;
        float nota = 8.5f;
        */
        
        /* ENTRADA DE DADOS (interativa)
        Cria objeto com a classe Scanner para receber a entrada de dados */
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //entrada de dados tipo String
        
        System.out.print("Digite a idade do aluno: ");
        int idade = teclado.nextInt(); //entrada de dados tipo int
                
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); //entrada de dados tipo float
        
        // SAÍDA DE DADOS
        System.out.println("O nome do aluno é " + nome);
        System.out.println("A idade do aluno é " + idade);
        System.out.println("A nota do aluno é " + nota);
    }
    
}
