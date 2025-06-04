// . Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo
// numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada
// vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para
// definir o atributo matricula automaticamente com um valor diferente para cada instância.
// Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar
// seu funcionamento.

package Questao41;

public class RegistroAcademico {
    private static int numeroMatriculas = 0; 
    private int matricula;                   
    private String nome;                     

   
    public RegistroAcademico(String nome) {
        this.nome = nome;
        numeroMatriculas++;           
        this.matricula = numeroMatriculas; 
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula;
    }
}
