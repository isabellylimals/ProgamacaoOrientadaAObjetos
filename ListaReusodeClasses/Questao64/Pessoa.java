
//  Crie uma classe Pessoa com ao menos 2 atributos a sua escolha. Escreva a classe
//  Politico que herda da classe Pessoa e tem um campo adicional para representar o partido
//  do político. Escreva também as classes Prefeito e Governador que herdam da classe
//  Politico e que contém um campo para representar a cidade ou estado governado. Todos
//  atributos devem ser privados. Cada classe deve ter um construtor e um método toString.
//  Lembre-se que cada método toString deve representar todos os atributos, inclusive os
//  herdados. Escreva também uma aplicação que demonstre o uso de instâncias destas
//  classes.
package ListaReusodeClasses.Questao64;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + "]";
    }

}
