package Lista6.Questao75;
// Em seguida, escreva a classe LivroDeBiblioteca que herda os campos e métodos da
// classe Livro e implementa os métodos declarados na interface ItemDeBiblioteca. LivroDeBiblioteca também deve possuir um construtor e um método toString. Crie os atributos
// que forem necessários.
// Por fim, crie a classe DemoLivroDeBiblioteca para demonstrar o uso de uma instância da
// classe LivroDeBiblioteca, isto é, criar um objeto do tipo LivroDeBiblioteca e executar seus
// métodos.
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;

    public LivroDeBiblioteca(int anoDaEdicao, String autor, int numeroDePaginas, String titulo) {
        super(anoDaEdicao, autor, numeroDePaginas, titulo);
        this.emprestado = false;
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public boolean  empresta() {
       return  emprestado = true;
    }

    @Override
    public boolean devolve() {
        return emprestado = false;
    }

    @Override
    public String localizacao() {
        return "Corredor 2, Prateleira D";
    }

    @Override
    public String descricao() {
        return "Livro de fantasia de vampiros";
    }

    @Override
    public String toString() {
        return "Disponibilidade: " + (emprestado ? "Está indisponível" : "Disponível") +
               "\nlocalizacao: " + localizacao() +
               "\ndescricao: " + descricao() +
               super.toString();
    }
}
