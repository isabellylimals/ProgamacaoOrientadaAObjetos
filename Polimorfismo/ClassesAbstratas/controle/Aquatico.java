package Polimorfismo.ClassesAbstratas.controle;

public abstract class Aquatico extends Veiculo{
    private float profundidade;

    public Aquatico(float profundidade, int capacidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return   super.toString() + "\nProfundidade: " + profundidade;
    }
    public abstract void moverFrente();

}
