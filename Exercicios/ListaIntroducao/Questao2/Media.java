// 2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
// valores reais serão informados pelo usuário

package Lista1.Questao2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] notas = new double[3];
        double media;
        double soma=0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira a %d nota: ", i+1 );
            notas[i]= sc.nextDouble();
            
            soma= soma+ notas[i];
            
        }
        System.out.printf("A media aritmetica das notas é: %.2f" , soma/3);


        sc.close();
    }
}
