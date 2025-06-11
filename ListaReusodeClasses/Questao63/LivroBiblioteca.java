package ListaReusodeClasses.Questao63;

public class LivroBiblioteca extends Livro {
    private boolean disponibilidade;

    public LivroBiblioteca(String titulo, String genero, String autor, boolean disponibilidade) {
        super(titulo, genero, autor);
        this.disponibilidade = disponibilidade;
    }
    public boolean emprestarLivro(){
       return  disponibilidade= false;
    }

    @Override
    public String toString() {
        return "\nDisponibilidade: " + (disponibilidade!=false ? "Disponivel" : "Indisponivel") + super.toString();
    }

    
}
