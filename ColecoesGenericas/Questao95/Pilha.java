// Pilha.java
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite uma expressão:");
            String entrada = sc.nextLine();

            if (validaExpressao(entrada)) {
                System.out.println("Esta Balanceada");
            } else {
                System.out.println("Nao esta balanceada");
            }
        }
    }

    public static boolean validaExpressao(String entrada) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; 
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty(); 
    }
}