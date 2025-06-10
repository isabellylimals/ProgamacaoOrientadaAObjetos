//  Escreva uma classe que encapsule uma matriz de tamanho 2×2 de valores do tipo float
//  usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
//  método que calcule o determinante da matriz encapsulada e um método que permita a
//  impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
//  demonstre as capacidades da classe criada.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.lerValores();
        matriz.imprimeValores();
        matriz.calculaDeterminante();
    }
}

class Matriz {
    Scanner sc = new Scanner(System.in);
    private float[][] numeros;
    private static final int linhas = 2;
    private static final int colunas = 2;
    float a, b, c, d;

    public Matriz() {
        numeros = new float[linhas][colunas];
    }

    public void calculaDeterminante() {
        float determinante = (a * d) - (b * c);
        System.out.println("Determinante: " + determinante);
    }

    public void lerValores() {
        System.out.print("Digite o número para a posição [0][0]: ");
        a = sc.nextFloat();
        numeros[0][0] = a;

        System.out.print("Digite o número para a posição [0][1]: ");
        b = sc.nextFloat();
        numeros[0][1] = b;

        System.out.print("Digite o número para a posição [1][0]: ");
        c = sc.nextFloat();
        numeros[1][0] = c;

        System.out.print("Digite o número para a posição [1][1]: ");
        d = sc.nextFloat();
        numeros[1][1] = d;
    }

    public void imprimeValores() {
        System.out.printf("[%.2f] [%.2f]\n[%.2f] [%.2f]\n", a, b, c, d);
    }
}
