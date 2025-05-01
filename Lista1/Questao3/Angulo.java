// // Escreva um programa que receba um ângulo em graus e o converta para sua represen
// tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
//  cotangente do ângulo.


package ProgamacaoOrientadaAObjetos.Lista1.Questao3;

import java.util.Scanner;

public class Angulo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira o ângulo em graus a ser convertido: ");
            double graus = sc.nextDouble();
            
            double radianos = Math.toRadians(graus);
            System.out.println(graus + "° é equivalente a: " + radianos + " radianos");
            
            double seno = Math.sin(radianos);
            double cosseno = Math.cos(radianos);
            double tangente = Math.tan(radianos);
            
            System.out.println("Seno: " + String.format("%.4f", seno));
            System.out.println("Cosseno: " + String.format("%.4f", cosseno));
            System.out.println("Tangente: " + String.format("%.4f", tangente));
          
            double cossecante = (seno != 0) ? 1 / seno : Double.POSITIVE_INFINITY;
            double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;
            double cotangente = (tangente != 0) ? 1 / tangente : 0;
            
            System.out.println("Cossecante: " + String.format("%.4f", cossecante));
            System.out.println("Secante: " + String.format("%.4f", secante));
            System.out.println("Cotangente: " + String.format("%.4f", cotangente));
        }
    }
}