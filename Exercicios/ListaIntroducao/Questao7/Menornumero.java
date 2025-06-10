//Escreva um programa que lê três números e determina qual número é o menor.
package Lista1.Questao7;

import java.util.Scanner;

public class Menornumero {
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int[] numero= new int[3];
    int menornumero=100000;
    for (int i=0; i<3; i++){
        System.out.println("Insira um numero inteiro:");
         numero[i]=sc.nextInt();
          if(numero[i]<menornumero){
            menornumero= numero[i];
          }
    }
    System.out.println("O menor numero é: "+ menornumero);
    sc.close();
    }
}
