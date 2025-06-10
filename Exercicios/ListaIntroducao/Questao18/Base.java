// Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente
// .
// Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
// 81 nesse exemplo)
// Assuma que expoente é um inteiro maior ou igual a 1.
package ListaIntroducaoJava.Questao18;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();
        System.out.println("Resultado: " + potencia(base, expoente));

        sc.close();
    }
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}
