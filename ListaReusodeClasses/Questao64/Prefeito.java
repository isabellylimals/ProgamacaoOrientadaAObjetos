package ListaReusodeClasses.Questao64;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Prefeito: [cidade=" + cidade + super.toString() + "]";
    }
    
    
}
