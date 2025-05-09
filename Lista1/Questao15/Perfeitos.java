// 15. Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
// é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
// 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.

package Lista1.Questao15;

public class Perfeitos {
    public static void main(String[] args) {
        
        int cont = 0;
        int numero=1;
    
        while (cont < 4) {
            int soma = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }
            if (soma == numero) {
                System.out.printf("%d é um número perfeito\n", numero);
                cont++;
            }
           numero++;
         }

    }}