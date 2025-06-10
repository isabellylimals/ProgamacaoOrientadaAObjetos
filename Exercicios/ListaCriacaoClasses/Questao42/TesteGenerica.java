package Questao42;
package Questao42;

public class TesteGenerica {
    public static void main(String[] args) {
        
        Generica<Integer> g1 = new Generica<>(10, 10, 10);
        g1.imprimir();
        System.out.println("Iguais: " + g1.contarIguais());

        
        Generica<String> g2 = new Generica<>("abc", "def", "abc");
        g2.imprimir();
        System.out.println("Iguais: " + g2.contarIguais());

      
        Generica<Double> g3 = new Generica<>(1.1, 2.2, 3.3);
        g3.imprimir();
        System.out.println("Iguais: " + g3.contarIguais());
    }
}
