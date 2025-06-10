package Questao38;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println("Estado inicial:");
        lampada.mostraEstado();
   System.out.println("Está ligada? " + lampada.estaLigada());
        System.out.println("\nAcendendo a lâmpada...");
        lampada.acende();

        lampada.mostraEstado();
        System.out.println("Quantidade de vezes que foi acesa: " + lampada.getQuantidadeVezesAcesa());

        System.out.println("\nAcendendo novamente (já está acesa)...");
        lampada.acende(); // aqui não deve contar de novo se o if estiver presente

        lampada.mostraEstado();
        System.out.println("Quantidade de vezes que foi acesa: " + lampada.getQuantidadeVezesAcesa());

        System.out.println("\nApagando a lâmpada...");
        lampada.apaga();
        lampada.mostraEstado();

        System.out.println("\nAcendendo de novo...");
        lampada.acende();
        lampada.mostraEstado();
        System.out.println("Quantidade de vezes que foi acesa: " + lampada.getQuantidadeVezesAcesa());
    }
}
