// Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
//  treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
//  espadas). O programa deve imprimir o nome da carta por extenso

package Lista1.Questao9;

import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o valor da carta (1 a 13):");
        int valor = sc.nextInt();
        
        
        System.out.println("Digite o naipe (1=Ouros, 2=Paus, 3=Copas, 4=Espadas):");
        int naipe = sc.nextInt();
        
        
        if (valor < 1 || valor > 13 || naipe < 1 || naipe > 4) {
            System.out.println("Valores inválidos!");
            return;
        }
        
        
        String nomeValor;
        switch (valor) {
            case 1:  nomeValor = "Ás"; break;
            case 11: nomeValor = "Valete"; break;
            case 12: nomeValor = "Dama"; break;
            case 13: nomeValor = "Rei"; break;
            default: nomeValor = String.valueOf(valor);
        }
        
        
        String nomeNaipe;
        switch (naipe) {
            case 1: nomeNaipe = "Ouros"; break;
            case 2: nomeNaipe = "Paus"; break;
            case 3: nomeNaipe = "Copas"; break;
            case 4: nomeNaipe = "Espadas"; break;
            default: nomeNaipe = "";
        }
        
        
        System.out.println("Carta: " + nomeValor + " de " + nomeNaipe);
        
        sc.close();
    }
}