package Colecoes.Fila;

import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args){
        PriorityQueue<Double> filaComPrioridade= new PriorityQueue<>();

        filaComPrioridade.offer(3.5);
        filaComPrioridade.offer(9.5);
        filaComPrioridade.offer(10.0);
        filaComPrioridade.offer(9.8);
        filaComPrioridade.offer(87.10);
        while(!filaComPrioridade.isEmpty()){
            System.out.println(filaComPrioridade.poll());
          
        }
    }
}
