
package segundaunidade.Excecoes.Exercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

// Faça um programa para somar dois números:
// • O programa deve conter um método int obterIntValido() para receber um número
// inteiro válido
// – Enquanto o valor não for um número inteiro, deve-se solicitar um novo número e
// exibir uma mensagem de erro.
// • O método principal deve utilizar obterIntValido() para obter os dois operandos e apresentar a soma deles
// • É obrigatório o uso de tratamento de exceção para realizar esta questão. Respostas
// que não utilizarem essa técnica serão completamente desconsideradas

public class Soma {
    public static void main(String[] args) {
        int a = obterIntValido();
        int b = obterIntValido();
        int soma = a + b;
        System.out.println("A soma dos números é: " + soma);
    }

    public static int obterIntValido() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        return numero;
    }
}

    

