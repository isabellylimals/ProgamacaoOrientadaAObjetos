package Polimorfismo.Interface;

public abstract class Empregado implements Pagavel {
    private String nome;
    private String ctps;

    public Empregado(String ctps, String nome) {
        this.ctps = ctps;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", ctps=" + ctps + "]";
    }

}
