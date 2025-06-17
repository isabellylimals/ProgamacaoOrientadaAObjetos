package Polimorfismo.ClassesAbstratas.controle;

public class Aviao extends Aereo{
    private String cadAviao;

    public Aviao(String cadAviao, String cadANAC, int capacidade) {
        super(cadANAC, capacidade);
        this.cadAviao = cadAviao;
    }

    @Override
    public String toString() {
        return "==Aviao==:\nCadAviao: " + cadAviao + super.toString();
    }


public void moverFrente(){
    System.out.println("Aviao está se movendo para frente");
}

}
