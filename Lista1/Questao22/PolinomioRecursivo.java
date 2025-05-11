// Dado um polinômio
// Pn(x) = a0x
// n + a1x
// n−1 + · · · + an−1x + an (1)
// este pode ser definido recursivamente como
// Pn(x) = xPn−1(x) + an (2)
// Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor
// x devem ser solicitados ao usuário na função main.

package Lista1.Questao22;
import java.util.Scanner;


public class PolinomioRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Grau do polinômio: ");
        int grau = sc.nextInt();

        System.out.print("Valor de x: ");
        int x = sc.nextInt();

        int resultado = calculaPolinomio(grau, x, sc);
        System.out.println("Resultado do polinômio: " + resultado);

        sc.close();
    }

    public static int calculaPolinomio(int grau, int x, Scanner sc) {
        System.out.print("Digite o coeficiente para a^" + grau + ": ");
        int coef = sc.nextInt();

        if (grau == 0) {
            return coef; // Caso base: último coeficiente
        }

        // Parte recursiva: x * P_(grau-1)(x) + coeficiente atual
        return x * calculaPolinomio(grau - 1, x, sc) + coef;
    }
}
