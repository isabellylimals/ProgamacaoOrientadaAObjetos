//  Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
//  um objeto da classe Random, uma vez para lançar o primeiro dado e novamente para
//  lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
//  pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
//  16
// 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
//  aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
//  contar o número de vezes que cada possível soma aparece. Exiba os resultados.

package Lista4ArrayList.Exercicio52;

import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        final int TOTAL_LANCAMENTOS = 36_000_000;
        int[] somas = new int[13]; // Índices de 0 a 12, mas usaremos apenas 2 a 12

        Random random = new Random();

        for (int i = 0; i < TOTAL_LANCAMENTOS; i++) {
            int dado1 = 1 + random.nextInt(6); // valor de 1 a 6
            int dado2 = 1 + random.nextInt(6);
            int soma = dado1 + dado2;
            somas[soma]++;
        }

        System.out.println("Soma\tFrequência");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + somas[i]);
        }
    }
}
