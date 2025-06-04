// 8. Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
// um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
// contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
// isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
// as capacidades da classe criada.

package Questao38;
public class Lampada {
    private boolean estadoDaLampada; // true = ligada, false = desligada
    private Contador contador;

    public Lampada() {
        estadoDaLampada = false;
        contador = new Contador();
    }

    public void acende() {
        if (!estadoDaLampada) { // só conta se estiver desligada
            estadoDaLampada = true;
            contador.incrementar();
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public int getQuantidadeVezesAcesa() {
        return contador.getValor();
    }
}
