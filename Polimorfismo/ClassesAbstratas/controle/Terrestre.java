package Polimorfismo.ClassesAbstratas.controle;

public abstract class Terrestre extends Veiculo {
    private int quantidadeRodas;

    public Terrestre(int quantidadeRodas, int capacidade) {
        super(capacidade);
        this.quantidadeRodas = quantidadeRodas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de Rodas= " + quantidadeRodas;
    }
    public abstract void moverFrente();
    
}
