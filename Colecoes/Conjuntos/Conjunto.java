package Colecoes.Conjuntos;

import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args){
        TreeSet<String> conjunto= new TreeSet<>();
        conjunto.add("preto");
        conjunto.add("roxo");
        conjunto.add("branco");
        conjunto.add("rosa");
        conjunto.add("verde");
        conjunto.add("amarelo");
        System.out.println(conjunto);
        System.out.println("Antes " + conjunto.headSet("preto"));
        System.out.println("A partir " + conjunto.tailSet("preto"));
         System.out.println("Primeira cor: " + conjunto.first());
              System.out.println("Ultima cor: " + conjunto.last());

    }
}
