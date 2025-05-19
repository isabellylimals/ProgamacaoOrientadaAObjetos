// 8. Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
// um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
// contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
// isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
// as capacidades da classe criada.

package Questao38;

public class Lampada {
    int estadoDaLampada; // 0 = desligado, 1 = ligado
     int contadorAcesa=0;
    public Lampada(int estadoDaLampada, int contadorAcesa) {
        this.contadorAcesa= contadorAcesa; 

        this.estadoDaLampada= estadoDaLampada;
        
    }
    public void acende(){
        estadoDaLampada= 1;
         contadorAcesa++;
     System.out.println("contagem de vezes que a lampada foi ligada: " + contadorAcesa);

        }
    public void apaga(){
        estadoDaLampada=0;
    }
    public void mostraEstado(){
        if(estadoDaLampada==1){
            System.out.println("Lâmpada Acesa");
        }else 
        if(estadoDaLampada==0){
              System.out.println("Lâmpada Apagada");
        }
        }
    
    public boolean estaLigada(){
        return estadoDaLampada == 1;
    }
}
