package Questao38;

public class DemoLampada {
    public static void main(String [] args){
        Lampada lamp= new Lampada(0,0);
        lamp.acende();
        lamp.apaga();
        lamp.acende();
        lamp.estaLigada();
        lamp.mostraEstado();
        lamp.apaga();
        lamp.mostraEstado();
        lamp.estaLigada();

    }
}
