
package saidadados;

public class SaidaDados {

    public static void main(String[] args) {

        //ENTRADA DE DADOS
        String nome = "Gustavo";
        int idade = 15;
        float nota = 8.5f;
        
        //SAÍDA DE DADOS: Padrão
        //apenas print
        //System.out.print("O aluno " + nome + ", de " + idade + " anos, tirou nota " + nota + ".");
        
        //print e pula linha
        System.out.println("O aluno " + nome + ", de " + idade + " anos, tirou nota " + nota + ".");
        
        /* SAÍDA DE DADOS: Formatada
        Observação:
        Os marcadores abaixo indicam onde e como os valores das variáveis serão
        inseridos. Os marcadores serão substituidos pelas variáveis de mesmo
        tipo, respectivamente na ordem em que são listadas.
        Exemplos comuns:
            - %d: Para um número inteiro.
            - %f: Para um número de ponto flutuante (real), com controle de 
                  casas decimais (ex: %.2f para duas casas).
            - %s: Para uma string.
            - %n: Um separador de linha independente do sistema.
        */       
        
        //opção 1
        System.out.printf("O aluno %s, de %d anos, tirou nota %.2f.\n", nome, idade, nota);
        
        //opção 2
        //System.out.format("O aluno %s, de %d anos, tirou nota %.2f.\n", nome, idade, nota);
        
    }
    
}
