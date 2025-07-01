import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String [] args){
        int numerador = 0;
        int denominador = 0;
        boolean denominadorIncorreto = false;
        boolean numeradorIncorreto = false;

        try (Scanner sc = new Scanner(System.in)) {

            do { 
                try {
                    System.out.println("Digite o numerador: ");
                    numerador = sc.nextInt(); 
                    numeradorIncorreto = true;
                } catch (InputMismatchException e) {
                    System.out.println("a entrada deve ser um número inteiro.");
                    sc.next(); 
                }
            } while (!numeradorIncorreto);

            do { 
                try {
                    System.out.println("Digite o denominador: ");
                    denominador = sc.nextInt();
                    denominadorIncorreto = true;
                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida");
                    sc.next();
                }
            } while (!denominadorIncorreto);

            System.out.println(numerador + "/" + denominador + "=" + divisaoInteira(numerador, denominador));
        }
    }

    public static int divisaoInteira(int numerador, int denominador){
        int resultado = 0;
        try {
            resultado = numerador / denominador;
        } catch (Exception e) {
            System.out.println("erro de divisão");
        }
        return resultado;
    }
}
//menortamanho possivel