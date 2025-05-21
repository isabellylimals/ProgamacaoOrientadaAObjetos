package primeiraunidade.CriacaoClasses.Contab;

public class ContaBancaria {
    private String nome;
    private float saldo;
    private boolean especial;
public ContaBancaria(String nome, float saldo, boolean especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0F;
        this.especial = false;
    }
    // @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", especial=" + especial +
                '}';
    }

  

}
