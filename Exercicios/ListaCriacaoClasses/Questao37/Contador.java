
// 37. Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
// Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
// com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
// capacidades da classe criada.

package Questao37;

public class Contador {
     private int contagemEventos;


       public void setCont(int cont){
           this.contagemEventos = cont;
       }
       public void zerar(){
           contagemEventos = 0;
       }
       public void incrementar(){
           contagemEventos++;
       }
       public int getCont(){      
           return contagemEventos;
       }
 
       
   }
