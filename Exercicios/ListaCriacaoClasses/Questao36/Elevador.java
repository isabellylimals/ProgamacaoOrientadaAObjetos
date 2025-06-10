// 36. Crie uma classe denominada Elevador para armazenar as informações de um elevador
// dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
// andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
// Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
// também disponibilizar os seguintes métodos:
// • construtor : que deve receber como parâmetros a capacidade do elevador e o total
// de andares no prédio (um elevador sempre começa no térreo e vazio);
// • entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
// houver espaço);
// • sai : para remover uma pessoa do elevador (só deve remover se houver alguém
// dentro dele);
// • sobe : para subir um andar (não deve subir se já estiver no último andar);
// • desce : para descer um andar (não deve descer se já estiver no térreo).
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
// execute todos os métodos da classe.


package Questao36;

public class Elevador {
      private int numAndar;
       private int totalAndares;
      private final int capacidade=6;
       private int pessoasPresentes;
        // Construtor
        public Elevador( int totalAndares) {
        
            this.totalAndares = totalAndares;
            this.numAndar = 0; 
            this.pessoasPresentes = 0; 

        }

       
        public void entra() {
            if (pessoasPresentes < capacidade) {
                pessoasPresentes++;
                System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes);
            } else {
                System.out.println("Elevador cheio! Não é possível entrar.");
            }
        }
        public void sai(){
            if(pessoasPresentes!=0){
                pessoasPresentes--;
                System.out.println("Uma pessoa sai, pessoas presentes: " + pessoasPresentes);
            }
            else{
                 System.out.println("Não tem ninguem no elevador.");
            }
        }
        public void sobe(){
            if(numAndar==totalAndares){
                System.out.println("Voce já esta no ultimo andar.");
            }
            else{
            numAndar++;
            System.out.println("andar: " + numAndar);
             }
        }
        public void desce(){
            if(numAndar==0){
                System.out.println("Voce esta no terreo nao há mais andares para baixo");
            }
            else{
                numAndar--;
                  System.out.println("andar: " + numAndar);
            }
        }

}
