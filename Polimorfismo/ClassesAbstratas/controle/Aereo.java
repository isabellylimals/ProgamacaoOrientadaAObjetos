package Polimorfismo.ClassesAbstratas.controle;

public abstract  class Aereo extends Veiculo {
    private String cadANAC;

    public Aereo(String cadANAC, int capacidade) {
        super(capacidade);
        this.cadANAC = cadANAC;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nCad ANAC: " + cadANAC;
    }
    public abstract void moverFrente();
}
