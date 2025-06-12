
//  Implemente a classe Funcionario com nome, salário e os métodos:
//  • aumentarSalario : recebe o valor do aumento e o adiciona ao salário;
//  • ganhoAnual : computa o valor recebido em 12 meses e o 13o;
//  • etoString : retorna uma representação textual de um objeto de Funcionario.
//  (i) Crie também a classe Assistente, que também é um funcionário e que possui um
//  número de matrícula (e seus métodos de acesso), além de um método toString.
//  (ii) Escreva as classes Tecnico e Administrativo
//  • Ambas as classes são filhas da classe Assistente
//  • Ambas as classes devem ter um método ganhoAnual
//  • Assistentes Técnicos possuem um bônus salarial
//  21
// • Assistentes Administrativos possuem um turno (dia ou noite) e um adicional no
// turno
//  (iii) Lembre-se que o 13o não possui adicional noturno, mas pode possuir bônus salarial
//  (se aplicável)

package ListaReusodeClasses.Questao65;

public class Funcionario {
    private String nome;
    public float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(float valorAumento){
        salario+= valorAumento;
    }
    public float ganhoAnual(){
        return (salario*12)+ salario;
    }

    
    public String getNome() {
        return nome;
    }
    public float getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "nome: " + nome + "\nsalario: " + salario;
    }
    
}
