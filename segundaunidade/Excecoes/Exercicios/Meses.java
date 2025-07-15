
package segundaunidade.Excecoes.Exercicios;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        try {
            int numero = scanner.nextInt();
            System.out.println("Mês: " + meses[numero - 1]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Número inválido! Digite um valor entre 1 e 12.");
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
        }
        scanner.close();
    }
}
