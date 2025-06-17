package Polimorfismo.ClassesAbstratas.controle;

public class Carro extends Terrestre{
    private String placa;

    public Carro(String placa, int quantidadeRodas, int capacidade) {
        super(quantidadeRodas, capacidade);
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "==Carro==: \nPlaca: " + placa + super.toString();
    }

    public Carro(String placa){
        super(4, 5);
        this.placa=placa;
    }

// @Override
public void moverFrente(){
    System.out.println("Carro está se movendo para frente");
}

  

    
}
