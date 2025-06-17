package Polimorfismo.ClassesAbstratas.controle;

public  abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "\nCapacidade: " + capacidade;
    }

public abstract  void moverFrente();

}
