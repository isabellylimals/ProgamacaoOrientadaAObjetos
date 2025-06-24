package Colecoes.Pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha= new Stack<>();
        System.out.println("Pilha vazia: " + pilha);
        pilha.push(4);
        System.out.println(pilha);
        pilha.push(8);
        pilha.push(478.5F);
        pilha.push(18);
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);

    }
}
