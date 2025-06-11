package ListaReusodeClasses.Questao63;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    public Livro(String titulo, String genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public String getAutor() {
        return autor;
    }
    @Override
    public String toString() {
        return "\ntitulo=" + titulo + "\ngenero=" + genero + "\nautor=" + autor ;
    }

    
    
    
}
