package Polimorfismo.ClassesAbstratas.controle;

public class Barco extends Aquatico {

    private String cadBarco;

    public Barco(String cadBarco, float profundidade, int capacidade) {
        super(profundidade, capacidade);
        this.cadBarco = cadBarco;
    }

    @Override
    public String toString() {
        return "==Barco==:\nCad Barco: " + cadBarco + super.toString() ;
    }
public void moverFrente(){
    System.out.println("Barco está se movendo para frente");
}
   
}
