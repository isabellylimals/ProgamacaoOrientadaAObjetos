package Lista6.Questao72;
// Defina uma classe para conter informações sobre um funcionário de uma empresa (classe
// Funcionario). Quais são os atributos dessa classe? Inclua entre eles o salário que o funcionário deve receber por hora trabalhada. Implemente, para essa classe, pelo menos
// dois métodos construtores: um que receba apenas o nome do funcionário e assuma valores padrão para os demais atributos (assuma que o funcionário deve receber dois reais
// por hora trabalhada); o segundo construtor deve receber, além do nome, o valor que o referido trabalhador deve receber por hora trabalhada. Identifique e implemente os demais
// métodos que achar conveniente para um objeto da classe Funcionario.

public class Funcionario {
    private String nome;
    private float salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario( String nome) {
        this.horasTrabalhadas = 8;
        this.nome = nome;
        this.salarioPorHora = 2.0f;
    }
    Funcionario(int horasTrabalhadas, String nome, float salarioPorHora){
        this.horasTrabalhadas= horasTrabalhadas;
        this.nome=nome;
        this.salarioPorHora=salarioPorHora;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioPorHora=" + salarioPorHora + ", horasTrabalhadas="
                + horasTrabalhadas + "]";
    }

    public float calculoSalario(){
        return (horasTrabalhadas*salarioPorHora)*28;
    }
    
    
}
