package ListaReusodeClasses.Questao61;
// Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
//  sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
//  da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
//  definidos em ambas as classes. Cada classe também deve ter um método toString.
//  Lembre-se que o método toString de Computador também deve representar os atributos
//  herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
//  objeto de cada classe, inicializar seus atributos e imprimí-los.
public class Equipamento {
    private String nome;
    private double preco;


    public Equipamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Equipamento [nome=" + nome + ", preco=" + preco + "]";
    }
}