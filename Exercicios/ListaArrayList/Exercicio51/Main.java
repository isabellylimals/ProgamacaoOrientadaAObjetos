package Lista4ArrayList.Exercicio51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaInteiros lista = new ListaInteiros();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos quer ter na lista? ");
        int quantidadeElementos = sc.nextInt();

        for (int i = 0; i < quantidadeElementos; i++) {
            System.out.print("Insira um valor: ");
            int valor = sc.nextInt();
            lista.addNum(new Inteiros(valor));
        }

      
        lista.imprimir();
        lista.produto();

        sc.close();
    }
}
