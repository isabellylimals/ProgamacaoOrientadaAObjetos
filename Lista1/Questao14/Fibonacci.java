
package Lista1.Questao14;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número positivo para gerar a sequência de Fibonacci: ");
        int n = sc.nextInt();

        int anterior = 0, atual = 1; 

        System.out.println("Série de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(atual + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        sc.close();
    }
}
