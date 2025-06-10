// 13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
// (somente com os números, respeitando o número de linhas e a distribuição dos números
// nas linhas)

package Lista1.Questao13;

import java.util.Scanner;

public class Megasena {
    public static void main(String[] args) {
        Scanner mega= new Scanner(System.in);
        System.out.println("TABELA MEGASENA");
        for(int i=1; i<=60;i++){
            if(i<10){
                System.out.printf("[0%d] ", i);
            }
            else{
                System.out.printf("[%d] ", i);
            }
           
             if(i==10){
                System.out.println();
             }
             if(i==20){
                System.out.println();
             }
             if(i==30){
                System.out.println();
             }
             if(i==40){
                System.out.println();
             }
             if(i==50){
                System.out.println();
             }
             if(i==60){
                System.out.println();
             }
        }

        mega.close();
    }
}
