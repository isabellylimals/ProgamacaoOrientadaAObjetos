package Lista1.Questao1;

import java.util.Scanner;

//1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua
//drado deverá ser informado pelo usuário.
//A área de um quadrado é dada pela fórmula: A = lado * lado
public class AreaQuadrado{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double lado;
        double area;
        System.out.print("Informe o valor do lado do quadrado: ");
        lado= sc.nextDouble();
        area= lado*lado;
        System.out.printf("A área do quadrado é: %.2f%n", area);
   sc.close();
    }
}