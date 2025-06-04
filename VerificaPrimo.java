import java.util.Scanner;

public class VerificaPrimo {

    public static boolean ehPrimoRec(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return ehPrimoRec(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (ehPrimoRec(numero, numero - 1)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}
