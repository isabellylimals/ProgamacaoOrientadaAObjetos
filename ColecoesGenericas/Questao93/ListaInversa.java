
// Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
// segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa.
// Não devem ser utilizados métodos da Java API para realizar a inversão.
package ColecoesGenericas.Questao93;

import java.util.Arrays;
import java.util.LinkedList;

public class ListaInversa {
    public static void main(String[] args) {
     
        LinkedList<Character> lista = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j'));
       

        LinkedList<Character> inversaLista = new LinkedList<>();
        inversa(lista, inversaLista);
    }

    public static void inversa(LinkedList<Character> lista, LinkedList<Character> inversaLista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            inversaLista.add(lista.get(i));
        }
        System.out.println("Original: " + lista);
        System.out.println("Inversa: " + inversaLista);
    }
}
