// Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
//  Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
//  variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável
//  de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.

package Lista1.Questao5;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        int unidade, dezena, centena;
        System.out.println("Insira um numero:");
        numero= sc.nextInt();
        
        unidade = numero % 10;
        dezena = (numero / 10) % 10; 
        centena = numero % 100; 
        
        int novoNumero = unidade * 100 + centena * 10 + dezena;
        
        System.out.println("Número original: " + numero);
        System.out.println("Número reescrito: " + novoNumero);
        sc.close();
    }
    
}
