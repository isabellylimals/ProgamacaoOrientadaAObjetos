// Crie uma função recursiva que verifique se um dado número é primo.

package Lista1.Questao21;

import java.util.Scanner;

public class PrimoRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();

        if (verificaPrimo(numero, 2)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    
    public static boolean verificaPrimo(int numero, int divisor) {
        if (numero <= 1) {
            return false; // 0 e 1 não são primos
        }
        if (numero%divisor!=0 && numero%3!=0) {
            return true; 
        }
        if (numero % divisor == 0) {
            return false; 
        }
        return verificaPrimo(numero, divisor + 1); 
    }
}
