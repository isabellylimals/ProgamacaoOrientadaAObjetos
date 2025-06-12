package Lista6.Questao75;
// Implemente também a classe Livro que encapsula os dados genéricos sobre um livro
// e métodos para processar estes dados. Essa classe é composta pelos atributos titulo,
// autor, numeroDePaginas e anoDaEdicao, além dos seguintes métodos:
// • construtor;
// • qualTitulo: retorna o título do livro;
// • qualAutor: retorna o autor do livro;
// • toString: retorna os valores dos campos desta classe em formato textual.
// Em seguida, escreva a classe LivroDeBiblioteca que herda os campos e métodos da
// classe Livro e implementa os métodos declarados na interface ItemDeBiblioteca. LivroDeBiblioteca também deve possuir um construtor e um método toString. Crie os atributos
// que forem necessários.
// Por fim, crie a classe DemoLivroDeBiblioteca para demonstrar o uso de uma instância da
// classe LivroDeBiblioteca, isto é, criar um objeto do tipo LivroDeBiblioteca e executar seus
// métodos.

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(int anoDaEdicao, String autor, int numeroDePaginas, String titulo) {
        this.anoDaEdicao = anoDaEdicao;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
    }
    public String qualTitulo(){
        return titulo;
    }
public String qualAutor(){
   return autor; 
}
@Override
public String toString() {
    return "\n=====Livro=====\ntitulo: " + titulo + "\nautor: " + autor + "\nnumeroDePaginas: " + numeroDePaginas + "\nanoDaEdicao: "
            + anoDaEdicao;
}

}
