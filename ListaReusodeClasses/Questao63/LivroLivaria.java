//  Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
//  diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
//  decadaclasse eescreva umaplicativo de teste que demonstre o uso das classes criadas

package ListaReusodeClasses.Questao63;

public class LivroLivaria extends Livro {
    private float preco;

    public LivroLivaria(String titulo, String genero, String autor, float preco) {
        super(titulo, genero, autor);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nPreco: " + preco + super.toString();
    }


    
    
}
