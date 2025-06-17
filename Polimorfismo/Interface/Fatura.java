package Polimorfismo.Interface;

public class Fatura implements Pagavel {
    private float preco;
    private int qtd;

    public Fatura(float preco, int qtd) {
        this.preco = preco;
        this.qtd = qtd;
    }
public float obterValorPagamento(){
    return qtd*preco;
}
    @Override
    public String toString() {
        return "Fatura [preco=" + preco + ", qtd=" + qtd + "]";
    }

}
