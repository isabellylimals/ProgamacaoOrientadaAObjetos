
// Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
// informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
package Lista1.Questao11;

import java.util.Scanner;

public class Pontos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int pontox, pontoy;
        System.out.println("Ponto 1:");
        pontox=sc.nextInt();
        System.out.println("Ponto 2:");
        pontoy=sc.nextInt();
        if(pontox>0 && pontoy >0){
            System.out.println("Esta acima.");
            
        }
        if(pontox> 0 && pontoy<0){
            System.out.println("Esta abaixo.");
        }
        if(pontox<0 && pontoy<0){
            System.out.println("Esta a esquerda.");

        }
        if(pontox<0 && pontoy>0){
            System.out.println("Esta a direita.");
        }

        sc.close();
    }
}
