/// 16. Escreva um programa que determine quais são todos os números de 3 algarismos cuja
// soma dos cubos de seus algarismos sejam iguais ao próprio número.

import java.util.Scanner;

public class Cubos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // int numero=100;
        int num01,num02,num03;
        for(int numero=100; numero<999;numero++){
             num03= numero%10;
            num02= (numero/10)%10;
            num01= numero/100;
            double somaAlgarismos= Math.pow(num01, 3) + Math.pow(num02, 3) + Math.pow(num03, 3);
            if(somaAlgarismos==numero){
            System.out.println(numero);
        }
        }
        
      
        sc.close();
    }
}
